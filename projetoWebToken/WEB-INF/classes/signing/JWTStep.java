package signing;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.jcommon.encryption.SimpleMD5;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

public class JWTStep {
	public static String   chave = "minhaChave";
	 SimpleMD5 md5; 
	 JWSSigner signer;
     JWTClaimsSet   claimsSet;
  	SignedJWT signedJWT;
  	 JWSVerifier  verifier;
  	 
  	 
  	 
 	
 	public  JWTClaimsSet   corpo() throws Exception{
 		claimsSet = new JWTClaimsSet.Builder()
  				.subject("token")
  			    .issuer("http://www.cotiinformatica.com.br")
   .expirationTime(new Date(new Date().getTime() + (10*60) * 1000))
        .claim("email","lucianamedeiros@gmail.com")
        .claim("datanascimento","28/01/1973")
        .build();
 		return claimsSet;
 	}
 	

	public  String   gerarToken( JWSSigner signer)  throws Exception {
	 	SignedJWT signedJWT = new SignedJWT(
	 			new JWSHeader(JWSAlgorithm.HS256),  claimsSet 
	 			);
	 	  signedJWT.sign(signer);
	 	  String s = signedJWT.serialize();
	 	  return s;
	}
 	
 	
	public   JWSSigner   assinar(byte cript[]) throws Exception{
		signer  = new MACSigner(cript);
		return signer;
	}

  	 
	public byte[] criptografar(String chave) throws Exception{
	md5 = new SimpleMD5(chave, "");
	 byte[] secret=md5.toHexString().getBytes(StandardCharsets.UTF_8);
	return secret;
	}
	


	
	
	public boolean verificarToken(String s )throws Exception {
	md5 = new SimpleMD5(chave, "");
   byte[] secret=md5.toHexString().getBytes(StandardCharsets.UTF_8);
		  signedJWT= SignedJWT.parse(s);		
		  verifier = new MACVerifier(secret );		
        return signedJWT.verify(verifier);
	}
	
 
	public static void main(String[] args) {
		try {
  
 		String chave="luciana";
			
			JWTStep token = new JWTStep();
	 token.corpo();
  String resp = token.gerarToken (token.assinar(token.criptografar(chave))); 
			
	 System.out.println(resp);	
	 
			  //=================
//	 ================================ 
	 
	 
    boolean ok =   token.verificarToken(resp);
     System.out.println(ok);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
