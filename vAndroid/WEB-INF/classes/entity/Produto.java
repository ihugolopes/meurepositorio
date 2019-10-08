package entity;

import java.io.Serializable;


public class Produto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	  private Integer idProduto;
	  private String nome;
	  private String  descricao;
	  private Double preco;
	  private Integer promocao;
	  
	  public Produto() {
	
	}
	  
	  
	  
	public Produto(Integer idProduto, String nome, String descricao, Double preco, Integer promocao) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.promocao = promocao;
	}



	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", promocao=" + promocao + "]";
	}



	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getPromocao() {
		return promocao;
	}
	public void setPromocao(Integer promocao) {
		this.promocao = promocao;
	}
	  
	  
	  
	 
	
	
	 
	
	

}
