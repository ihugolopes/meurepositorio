package entity;

import java.io.Serializable;

public class Endereco  implements Serializable{
	private static final long serialVersionUID = 1L;

	  private Integer enderecoId;
	  private String logradouro;
	  private String bairro;
	  private String cidade;
	  private String estado;
	  private String cep;
	  private Integer usuario_id;
	  //OneToOne
	  private Usuario usario;
	  
	  
	public Endereco() {
	}
 
	public Endereco(Integer enderecoId, String logradouro, String bairro, 
			                   String cidade, String estado, String cep,
			                   Integer usuario_id) {
		super();
		this.enderecoId = enderecoId;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.usuario_id = usuario_id;
	}

	public Endereco(Integer enderecoId, String logradouro, String bairro, String cidade, String estado, String cep) {
		super();
		this.enderecoId = enderecoId;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	 
	
	@Override
	public String toString() {
		return "Endereco [enderecoId=" + enderecoId + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + ", cep=" + cep + ", usuario_id=" + usuario_id + "]";
	}

	public Integer getEnderecoId() {
		return enderecoId;
	}
	public void setEnderecoId(Integer enderecoId) {
		this.enderecoId = enderecoId;
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
	public Usuario getUsario() {
		return usario;
	}
	public void setUsario(Usuario usario) {
		this.usario = usario;
	}
	public Integer getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}
	  
	  

}
