package main;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	    @Column(length=50)
	 private String nome;
	     @Column(length=50,unique=true)
	  private String email;
	     @Column(length=255)
	 private String foto;
	     
	     public Cliente() {
		
		}
	     
	     
	public Cliente(Long id, String nome, String email, String foto) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.foto = foto;
		}

	
	
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", foto=" + foto + "]";
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	

}
