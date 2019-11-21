package entity;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String email;
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ",  email=" + email + ", senha=" + senha + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean isNome() {
		Pattern p = Pattern.compile("[a-z A-Z Ã-Ç à-ü]{2,50}"); // define
		Matcher m = p.matcher(this.nome); // aplica
		return m.matches(); // retorna true ou false
	}

	public Boolean isEmail() {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+"); // define
		Matcher m = p.matcher(this.email); // aplica
		return m.matches(); // retorna true ou false
	}

	public Boolean isSenha() {
		Pattern p = Pattern.compile("[a-zA-Z0-9]{3,50}"); // define
		Matcher m = p.matcher(this.senha);// aplica
		return m.matches(); // retorna true ou false
	}

	public static void main(String[] args) {
		System.out.println("É alfabético: " + Character.isAlphabetic('A'));
		System.out.println("É dígito: " + Character.isDigit('8'));
		Usuario u = new Usuario(10, "Hugo", "hugoo@gmail.com", "123");
		System.out.println("É nome: " + u.isNome());
		System.out.println("É email: " + u.isEmail());
		System.out.println("É senha: " + u.isSenha());
	}
}
