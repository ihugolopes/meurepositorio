package entity;

import com.opensymphony.xwork2.ActionSupport;

import persistence.LoginDao;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private static String username;
	private static String password;

	public String execute() throws Exception {
		LoginDao dao = new LoginDao();
		String senhaCriptografada = dao.gerarCriptografia(password);
		String result = dao.logar(username, senhaCriptografada);

		if (result == "sucess") {
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws Exception {

		LoginDao dao = new LoginDao();
		String result = dao.logar("hugo@gmail.com", "123");

		if (result == "sucess") {
			System.out.println("Loguei!");
		} else {
			System.out.println("Não loguei!");
		}

	}
}
