package entity;

import java.util.List;

import javax.xml.ws.WebFault;

@WebFault(name="ClienteValidadorFault", messageName="ClienteValidadorFault")
public class ClienteValidadorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClienteValidadorException(List<String> erros) {
		super(erros.toString());
	}
	
}
