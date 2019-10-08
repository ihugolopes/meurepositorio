package entity;

import java.io.Serializable;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private Double salario = 0.;
	private Double bonus = 0.;

	public Funcionario() {
	}

	public Funcionario(Long id, String nome, String email, Double salario, Double bonus) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", salario=" + salario + ", bonus="
				+ bonus + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Double getBonus() {
		return bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}
