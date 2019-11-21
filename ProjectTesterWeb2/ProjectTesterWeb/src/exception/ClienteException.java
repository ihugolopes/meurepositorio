package exception;

import javax.xml.ws.WebFault;

@WebFault(name = "ClienteExceptionFault", messageName = "ClienteExceptionFault")
public class ClienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public final String ERRO_SUCURSAL = "Surcursal obrigatório!";
	public final String ERRO_ITEM = "Item obrigatório!";
	public final String ERRO_RAMO = "Ramo obrigatório!";
	public final String ERRO_NUMEROAPOLICE = "Número Apólice obrigatório!";
	
	public final String ERRO_SUCURSALN = "Sucursal inválida, entre com um valor válido!!";
	public final String ERRO_ITEMN = "Item inválido, entre com um valor válido!";
	public final String ERRO_RAMON = "Ramo inválido, entre com um valor válido!";
	public final String ERRO_NUMEROAPOLICEN = "Número Apólice inválido, entre com um valor válido!";

	private String message;

	public ClienteException(int n) {
		switch (n) {
		case 1:
			this.message = ERRO_SUCURSAL;
			break;
		case 2:
			this.message = ERRO_SUCURSALN;
			break;
		case 3:
			this.message = ERRO_ITEM;
			break;
		case 4:
			this.message = ERRO_ITEMN;
			break;
		case 5:
			this.message = ERRO_RAMO;
			break;
		case 6:
			this.message = ERRO_RAMON;
			break;
		case 7:
			this.message = ERRO_NUMEROAPOLICE;
			break;
		case 8:
			this.message = ERRO_NUMEROAPOLICEN;
			break;

		default:
			this.message = "Erro não definido!";
			break;
		}
	}

	public String getMessage() {
		return message;
	}

}
