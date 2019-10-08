package entity;

import java.io.Serializable;

public class Cliente  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private  Integer  id;
	private String nome;
	private String email;
    private Integer ativo; //nao existe mais exclusao
		                                 //ip de onde ele fala ...
                                          //gps ... lat e long...
    public Cliente() {
	}
 	public Cliente(Integer id, String nome, String email, Integer ativo) {
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.ativo = ativo;
    }

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", ativo=" + ativo + "]";
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
	public Integer getAtivo() {
		return ativo;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	
	
	

}
