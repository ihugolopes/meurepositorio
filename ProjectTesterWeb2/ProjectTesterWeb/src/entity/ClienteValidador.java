package entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.WebFault;

@WebFault(name="ClienteValidadorFault", messageName="ClienteValidadorFault")
public class ClienteValidador extends RuntimeException {
	
	static final long serialVersionUID = 1L;
	
	Cliente cliente;

	public ClienteValidador(Cliente item) {
		this.cliente = item;
	}

	public void validate() {
		List<String> erros = new ArrayList<>();
		
		String nomeDoDocumento = cliente.getNomeDoDocumento();
		if(estaVazio(nomeDoDocumento)){
			erros.add("Codigo invalido");
		}

		String sucursal = cliente.getSucursal();
		if(estaVazio(sucursal)){
			erros.add("Nome invalido");
		}
		
		String item = cliente.getItem();
		if(estaVazio(item)){
			erros.add("Quantidade invalida");
		}
		
		String ramo = cliente.getRamo();
		if(estaVazio(ramo)) {
			erros.add("Tipo invalido");
		}
		
		String numeroApolice = cliente.getNumeroApolice();
		if(estaVazio(numeroApolice)) {
			erros.add("Tipo invalido");
		}
		
		if(!erros.isEmpty()){
			throw new ClienteValidadorException(erros); 
		}
	}

	private boolean estaVazio(String valor) {
		return valor == null || valor.isEmpty();
	}

}
