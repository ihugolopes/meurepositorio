package entity;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private  Double  _id;
	 private String   nome;
	 private String   email;
	 private Double ativo;
	 
	 public Cliente() {
	
	}
	 
	public Cliente(Double _id, String nome, String email, Double ativo) {
		super();
		this._id = _id;
		this.nome = nome;
		this.email = email;
		this.ativo = ativo;
	}
	
	



	@Override
	public String toString() {
		return "Cliente [_id=" + _id + ", nome=" + nome + ", email=" + email + ", ativo=" + ativo + "]";
	}

	public Double get_id() {
		return _id;
	}
	public void set_id(Double _id) {
		this._id = _id;
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
	public Double getAtivo() {
		return ativo;
	}
	public void setAtivo(Double ativo) {
		this.ativo = ativo;
	}
	
	
	
	

}
