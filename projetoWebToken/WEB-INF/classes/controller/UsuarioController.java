package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Usuario;
import repository.UsuarioRepository;
import signing.JWTStep;

@Controller
public class UsuarioController {

	@Autowired
	 UsuarioRepository udao;
	
	@PostMapping(value="/login",
    consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    produces = MediaType.TEXT_PLAIN_VALUE
			)
	 public @ResponseBody  String  login(
			    @RequestParam   String login,
			   @RequestParam  String senha
			  )	{
		Usuario resp =  udao.findByLoginAndSenha(login, senha);
		try {   
		 if (resp!=null) {
			 JWTStep step = new JWTStep();
			   step.corpo();
String token=    step.gerarToken(step.assinar(step.criptografar(JWTStep.chave)));
     return token;
		 }else {
			 return "nao logado";
		 }
		 
		}catch(Exception ex) {
			return "Erro :" + ex.getMessage();
		}
	}
	
	
//	@PostMapping(value="/listar",
//		    consumes=MediaType.APPLICATION_JSON_VALUE,
//		    produces = MediaType.APPLICATION_JSON_VALUE
//					)
//	 public ResponseEntity <?> token( @RequestBody 	 String token    )
//	{
//		try {
//		 JWTStep step = new JWTStep();
//		 boolean resposta = step.verificarToken(token);
//		 System.out.println(resposta);
//		  if (resposta==true) {
//   return new ResponseEntity (udao.findAll(),  HttpStatus.ACCEPTED);
//		  }else {
//			  Map<String,String> mapa = new HashMap<String,String>();
//			   mapa.put("error", "Token Invalido ...");
// return  new ResponseEntity ( mapa.toString(),   HttpStatus.NOT_ACCEPTABLE);
//		  }
//     	}catch(Exception ex) {
//return   new ResponseEntity ( "Error :" + ex.getMessage(),   HttpStatus.NOT_ACCEPTABLE);		
//		}
//	}
	
	
	
	
	@PostMapping(value = "/listar", 
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
   produces = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String listar(@RequestParam String token) {
		Map<String, String> mapa = new HashMap<String, String>();

		if (token != null) {
			JWTStep step = new JWTStep();
			try {
				if ( step.verificarToken(token)) {
					mapa.put("Usuario", udao.findAll().toString());
					return mapa.toString();

				} else {
					mapa.put("Error: ", "Token inválido");
					return mapa.toString();
				}
			} catch (Exception e) {
				mapa.put("Error: ", "Token inválido");
				return mapa.toString();
			}
		} else {
			mapa.put("Error: ", "Token inválido");
			return mapa.toString();
		}
	}
	
	
	
	
	
	
	
	
}
