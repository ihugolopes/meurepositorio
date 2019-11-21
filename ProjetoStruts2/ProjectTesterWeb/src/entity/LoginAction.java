package entity;

import com.opensymphony.xwork2.ActionSupport;

import persistence.LoginDao;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private static String username;
	private static String password;

	public String execute() throws Exception {
		LoginDao dao = new LoginDao();
//		String senhaCriptografada = dao.gerarCriptografia(password);
		boolean result = dao.logar(username, password);

		if (result == true) {
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
		boolean result = dao.logar("hugo@gmail.com", "123");

		if (result == true) {
			System.out.println("Loguei!");
		} else {
			System.out.println("Não loguei!");
		}

	}
}
