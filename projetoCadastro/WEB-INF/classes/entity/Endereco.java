package entity;

import java.io.Serializable;
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	 private  Integer id;
	  private String logradouro;
	  private String bairro;
	  private String cidade;
	  private  String estado;
	  private String  cep;
	  //Endereco está me Vendo o Cliente ...
	  //Relacionamento 1 para 1
	  //aqui a cabe a chave estrangeira é o Objeto ...
	  //Endereco tem o Cliente ....
	  private Cliente cliente;
	  
	 public Endereco() {
	
	} 

	public Endereco(Integer id, String logradouro, String bairro, String cidade, String estado, String cep) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", cep=" + cep + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	  
	  
	  
	  
	  
	
 
}
