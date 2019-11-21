package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Login;

public class ControllerLogin {

	private List<Login> logins;

	public List<Login> getLogins() {
		return logins;
	}

	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}

	public void adicionar(Login l) {
		if (logins == null) {
			this.logins = new ArrayList<Login>();
		}
		this.logins.add(l);
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

	public static void main(String[] args) {
		ControllerLogin ctl = new ControllerLogin();
		ctl.adicionar(new Login(12, "giordano", "giordano@gmail.com", "123"));
		ctl.adicionar(new Login(11, "dragonball", "dragonball@gmail.com", "123"));
		ctl.adicionar(new Login(14, "lu", "lu@gmail.com", "123"));
		ctl.adicionar(new Login(13, "ada", "ada@gmail.com", "123"));
		ctl.ordenar2();
		ctl.getLogins().stream().forEach(System.out::println);
	}
}
