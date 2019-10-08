package entity;

import java.io.Serializable;

public class Produto  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer   id;
	private String     nomeProduto;
	private Double   preco;
	private String     imagem;
	
	 public Produto() {
	
	}
	
	public Produto(Integer id, String nomeProduto, Double preco, String imagem) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.imagem = imagem;
	}

   


	@Override
	public String toString() {
		return "Produto [idProduto=" + id + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", imagem="
				+ imagem + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	
}
