package model;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCliente;
	private String nome;
	private String email;

	public Cliente() {

	}

	public Cliente(Integer idClente, String nome, String email) {
		this.idCliente = idClente;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [idClente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

	private void titular() {
		System.out.println(this);

	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Cliente setEmail(String email) {
		this.email = email;
		return this;
	}

	// get e Set
	// contrutor vario e cheio
	// toString

}
