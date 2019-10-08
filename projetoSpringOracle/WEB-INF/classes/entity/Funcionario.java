package entity;

import java.io.Serializable;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private   Integer id;
	private String nome;
	private Double salario;
	private String email;
	private String senha;
	
	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, Double salario, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.email = email;
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + 
				", salario=" + salario +
				 ", email=" + email + "]";
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
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
	
	
	

}
