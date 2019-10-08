package mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import entity.Cliente;

public class EnviarEmail {
	
	
	 private static final String HOSTNAME="smtp.gmail.com";
	 //email da empresa
	 private static final String USERNAME="cotiexemplo@gmail.com";
	 private static final String PASSWORD="@coticoti@";
	  public static Email conectaEmail() throws EmailException{
		   HtmlEmail mail =new HtmlEmail();
		    mail.setHostName(HOSTNAME);
		    mail.setSmtpPort(465);
		    mail.setAuthentication(USERNAME, PASSWORD);
		     mail.setTLS(true);
		     mail.setSSL(true);
		    mail.setFrom(USERNAME);
		  return mail;
	  }
	  
	  public static String enviarEmail(Cliente c)throws Exception{
		    HtmlEmail email = new HtmlEmail();
		      String caminho="http://Controller";
		      email = (HtmlEmail) conectaEmail();
		      email.setSubject("Ativar seu Registro como Aluno da Coti");
		      email.addTo(c.getEmail()); //enviando para email para cadastro
		      email.setCharset("UTF-8");
		      String msg="<a href=>"+"Ativar Conta</a>";
		     email.setMsg(msg);
		     email.send();
		      return "Email Enviado com Sucesso ...";
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	 
	 
	
	
	
	
	
	

}
