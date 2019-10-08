package email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import entity.Proprietario;

public class EnviarEmail {
	private static final String HOSTNAME = "smtp.gmail.com";
	private static final String USERNAME = "hugolopes18@gmail.com";
	private static final String PASSWORD = "@hugo270365@";

	public static Email conectaEmail() throws EmailException {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName(HOSTNAME);
		mail.setSmtpPort(465);
		mail.setAuthentication(USERNAME, PASSWORD);
		mail.setTLS(true);
		mail.setSSL(true);
		mail.setFrom(USERNAME);
		return mail;
	}

	public static String enviarEmail(Proprietario p) throws Exception {
		HtmlEmail email = new HtmlEmail();
		String caminho = "http://controller";
		email = (HtmlEmail) conectaEmail();
		email.setSubject("Ativar seu Registro");
		email.addTo(p.getEmail()); 
		email.setCharset("UTF-8");
		String msg = "<a href=>" + "Ativar Conta</a>";
		email.setMsg(msg);
		email.send();
		return "Email Enviado com Sucesso ...";
	}

}
