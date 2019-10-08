package entity;

import java.io.Serializable;

public class Cliente  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	 private String nome;
	 
	 ///Cliente
	 
	 private PlanoPagamento pagamento;
	 
	 public Cliente() {
	 }
	 
	 
	public Cliente(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + "]";
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


	public PlanoPagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(PlanoPagamento pagamento) {
		this.pagamento = pagamento;
	}
	 
	 
 
	
	
}
