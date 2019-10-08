package entity;

import java.io.Serializable;

public class PlanoPagamento implements Serializable{


	private static final long serialVersionUID = 1L;
	private Integer id;
	private   String     nomePlano;
	private   Double   valor;
	
	//Outra Tabela ...
	private   Cliente   cliente;

	public PlanoPagamento() {

	}

	public PlanoPagamento(Integer id, String nomePlano, Double valor) {
		this.id = id;
		this.nomePlano = nomePlano;
		this.valor = valor;
	}
	
	

	@Override
	public String toString() {
		return "PlanoPagamento [id=" + id + ", nomePlano=" + nomePlano + ", valor=" + valor + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomePlano() {
		return nomePlano;
	}

	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
