package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	static ArrayList<String> VALORES = new ArrayList<String>();
	static {
		VALORES.add("USU");
		VALORES.add("ADM");
		VALORES.add("CONVIDADO");
	}

	private String nome;
	private String perfil;
	private String cargo;
	private List<Usuario> usuarios;

	public Usuario() {
	}

	public Usuario(String nome, String perfil, String cargo) {
		this.nome = nome;
		if (VALORES.contains(perfil.toUpperCase().trim())) {
			this.perfil = perfil;
		} else {
			System.out.println("Perfil não definido!");
			System.exit(0);
		}
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Usuario: nome=" + nome + ", perfil=" + perfil + ",  cargo=" + cargo + "\n";
	}

	public static ArrayList<String> getVALORES() {
		return VALORES;
	}

	public static void setVALORES(ArrayList<String> vALORES) {
		VALORES = vALORES;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void adicionar(Usuario u) {
		if (usuarios == null) {
			this.usuarios = new ArrayList<Usuario>();
		}

		if (this.getPerfil().equalsIgnoreCase("adm")) {
			this.usuarios.add(u);
		} else {
			throw new IllegalArgumentException("Não pode adicionar se não for ADM");
		}
	}

	public static void main(String[] args) {
		try {
			Usuario a = new Usuario("Hugo", "adm", "Programador");
			Usuario b = new Usuario("Carlos", "usu", "BI");
			Usuario c = new Usuario("Antônio", "usu", "dba");
			
			a.adicionar(a);
			a.adicionar(b);
			a.adicionar(c);
			
			System.out.println(a);
			System.out.println("-------");
			System.out.println(a.getUsuarios());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
