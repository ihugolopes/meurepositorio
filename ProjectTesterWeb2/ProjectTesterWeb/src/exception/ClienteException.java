package exception;

import javax.xml.ws.WebFault;

@WebFault(name = "ClienteExceptionFault", messageName = "ClienteExceptionFault")
public class ClienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public final String ERRO_SUCURSAL = "Surcursal obrigat�rio!";
	public final String ERRO_ITEM = "Item obrigat�rio!";
	public final String ERRO_RAMO = "Ramo obrigat�rio!";
	public final String ERRO_NUMEROAPOLICE = "N�mero Ap�lice obrigat�rio!";
	
	public final String ERRO_SUCURSALN = "Sucursal inv�lida, entre com um valor v�lido!!";
	public final String ERRO_ITEMN = "Item inv�lido, entre com um valor v�lido!";
	public final String ERRO_RAMON = "Ramo inv�lido, entre com um valor v�lido!";
	public final String ERRO_NUMEROAPOLICEN = "N�mero Ap�lice inv�lido, entre com um valor v�lido!";

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
			this.message = "Erro n�o definido!";
			break;
		}
	}

	public String getMessage() {
		return message;
	}

}
