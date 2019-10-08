package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//J7
//lista onde mostre o produto mais caro ...
public class Produto  implements Serializable,
Comparable<Produto>
  {
   	   // implementacao da Interface Serializable e Comparable
	    //Comprable (Ordenar)
    	// Comprable (compareTo) -- Ordenar 
	
	private Integer idProduto;
	private String nome;
	private Double preco;
	
	public Produto() {

	}
	
	
	public Produto(Integer idProduto, String nome, Double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + "]";
	}


	//ordenando pelo preco
	@Override
	public int compareTo(Produto p) {
		return this.preco.compareTo(p.getPreco());
	}

 
	 public boolean equals(Object o) {
		 Produto p = (Produto) o;
		 return this.idProduto.equals(p.getIdProduto());
	 }
	//Busco pelo ID
	 //Ordeno pelo Preco  ...
	 
/////////////////////////
	 public static void main(String[] args) {
		
   Produto p1 = new Produto(1000,"ifome",30.);
   Produto p2 = new Produto(1001,"Mata-Fome",18.);
   Produto p3 = new Produto(1002,"X-TUDAO",32.);
    List<Produto> lista= new ArrayList<Produto>();
       lista.add(p1);lista.add(p2);lista.add(p3);
     
       //Comprarable<Produto>
       //compareTo
       Collections.sort(lista);
    lista.stream().forEach(System.out::println); //J8
       

		 
    Produto p4 = new Produto(1002,"ACoisa",38.);
    
     System.out.println(p3.equals(p4));
 
       
       
       
       
		 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
