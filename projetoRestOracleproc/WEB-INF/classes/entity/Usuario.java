package entity;

import java.io.Serializable;

public class Usuario  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	  private  Integer usuarioId;
	  private  String nome;
	  private String email;
	  //OneToOne
	  private Endereco endereco;  
	  
	
	public Usuario(Integer usuarioId, String nome, String email) {
		super();
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.email = email;
	}


	public Usuario(Integer usuarioId, String nome, String email, Endereco endereco) {
		super();
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public Usuario() {
	}

 
	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", nome=" + nome + ", email=" + email 
				+ "]";
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


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	  
	  
	 

}
