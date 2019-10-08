package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jcommon.encryption.SimpleMD5;

import entity.Login;
import error.ErrorLogin;
import error.ExceptionDao;
import persistence.LoginDao;

public class CLogar {

	private List<Login> logins;

	public CLogar() {
		this.logins = new ArrayList<Login>();
	}

	public List<Login> getLogins() {
		return logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
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

	public void adicionar(Login l) throws Exception {
		if (logins == null) {
			this.logins = new ArrayList<Login>();
		}
		this.logins.add(l);
		LoginDao dao = new LoginDao();
		try {
			dao.create(l);
		} catch (ExceptionDao e) {
			new ExceptionDao(1);
		}
	}

	public void ordenar() {
		Comparator<Login> log = new Comparator<Login>() {

			@Override
			public int compare(Login o1, Login o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		};
		Collections.sort(logins, log);
	}

	public void ordenar2() {
		Comparator<Login> comp = (a, b) -> a.getId().compareTo(b.getId());
		Collections.sort(logins, comp);
	}

	public String gerarCriptografia(String senha) {
		SimpleMD5 md5 = new SimpleMD5(senha, "alongamentoDeSenha");
		senha = md5.toHexString();
		return senha;
	}

	public static void main(String[] args) throws Exception {
		CLogar ctl = new CLogar();

		System.out.println("-----PARTE 1---------");
		System.out.println("-----CRIANDO:---------");
		System.out.println("");
		String senha = "hugo123";
		String senhaMD5 = ctl.gerarCriptografia(senha);
		ctl.adicionar(new Login(4, "Hugo2", "hugo2@gmail.com", senhaMD5));
//		
//		ctl.adicionar(new Login(3, "Helder", "helder@gmail.com", "123"));

//		System.out.println("-----PARTE 2---------");
//		System.out.println("-----ORDENANDO e BUSCANDO:---------");
//		System.out.println("");
//
//		ctl.ordenar2();
//		ctl.getLogins().stream().forEach(System.out::println);
//
//		System.out.println("");
//		System.out.println("-----PARTE 3---------");
//		System.out.println("-----LOGANDO:---------");
//		System.out.println("");
//
//		try {
//			CLogar lg = new CLogar();
//			// ADICIONANDO POR LISTA.
//			lg.logins.add(new Login(11, "lu", "luciana@gmail.com", "123"));
//			lg.logins.add(new Login(11, "ca", "caciano@gmail.com", "123"));
//
//			Login loga = lg.logar("hugo@gmail.com", "123");
//
//			System.out.println(loga);
//
//		} catch (ErrorLogin xg) {
//			System.out.print("Mensagem: ");
//			System.out.println(xg.getMessage());
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}

}
