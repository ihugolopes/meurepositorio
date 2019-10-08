package entity;

import java.io.Serializable;

import org.jcommon.encryption.SimpleMD5;

public class Usuario  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario() {
		
	}
	
	
	public Usuario(Long id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	 public  void gerarCriptografia() {
		   SimpleMD5 md5 = new SimpleMD5(this.senha,
   "profedsonbelem@gmail.com==1www.cotiinformatica.com.br=1+1' ");
		    setSenha(md5.toHexString());		 
	 }
	
	
	//123+profedsonbelem@gmail.com==1www.cotiinformatica.com.br
	
	public static void main(String[] args) {
		 Usuario u = new Usuario();
		  u.setNome("bengazi");
		  u.setSenha("123");
		      u.gerarCriptografia();
		      System.out.println(u.getNome() + "," + u.getSenha());
		  
		
		
		
	}
	
	
	
	
	
	
	
	
}
