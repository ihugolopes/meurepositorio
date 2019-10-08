package persistence;

import entity.Cliente;
import entity.PlanoPagamento;

public class DtoClientePlano {
	// DTO Significa juncao de Classes
	//DTO chama as DUAS CLASSES
	private Cliente cliente;
	private PlanoPagamento plano;
	
	 public DtoClientePlano(Cliente c, PlanoPagamento p) {
		 this.cliente = c;
		 this.plano = p;
	 }
	

	@Override
	public String toString() {
		return "DtoClientePlano [cliente=" + cliente + ", plano=" + plano + "]";
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PlanoPagamento getPlano() {
		return plano;
	}

	public void setPlano(PlanoPagamento plano) {
		this.plano = plano;
	}

}
