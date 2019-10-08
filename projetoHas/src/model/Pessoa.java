package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer idPessoa;
	private String nome;

	// metodo fantasma
	private String acesso() {
		if ((getIdPessoa().equals(1234)) && (getNome().equals("teste"))) {
			return "entrada garantida";
		} else {
			return null;
		}
	}

	// esse eu desco
	public void interceptor() {
		// acesso() --entrada garantidade, ou null
		if (acesso() == null)
			throw new IllegalArgumentException("ERROR");
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public Pessoa setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}

}
