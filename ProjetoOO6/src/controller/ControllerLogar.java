package controller;

import java.util.ArrayList;
import java.util.List;

import entity.Login;
import error.ErrorLogin;

public class ControllerLogar {

	private List<Login> logins;

	// gera duas vidas ...
	public ControllerLogar() {
		this.logins = new ArrayList<Login>(); // Composicao...
	}

	public Login logar(String login, String senha) throws ErrorLogin {
		if (login == null) {
			throw new ErrorLogin(1);
		} else if (senha == null) {
			throw new ErrorLogin(2);
		} else if (login.length() < 3 & senha.length() < 3) {
			throw new ErrorLogin(3);
		}

		Login resp = logins.stream().filter(a -> (a.getEmail().equals(login) && a.getSenha().equals(senha))).findAny()
				.orElseThrow(() -> new ErrorLogin(3));

		return resp;
	}

	public List<Login> getLogins() {
		return logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		// Procura o errado
		if (a++ == 11 && b++ == 11) {
			System.out.println("um");
		} else {
			System.out.println("dois");
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int c = 1;
		int d = 1;

		// Procura o certo
		if (++c == 2 || d++ == 1) {
			System.out.println("tres");
		} else {
			System.out.println("quatro");
		}

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		try {
			ControllerLogar lg = new ControllerLogar();

			lg.logins.add(new Login(10, "luis", "luis@gmail.com", "123"));
			lg.logins.add(new Login(11, "lu", "luciana@gmail.com", "123"));
			lg.logins.add(new Login(12, "marcion", "marcio@gmail.com", "123"));
			lg.logins.add(new Login(13, "belem", "belem@gmail.com", "123"));

			Login loga1 = lg.logar("luciana@gmail.com", "123");
			System.out.println(loga1);
			Login loga2 = lg.logar("luciana@gmail.com", "124");
			System.out.println(loga2);

		} catch (ErrorLogin xg) {
			System.out.println(xg.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
