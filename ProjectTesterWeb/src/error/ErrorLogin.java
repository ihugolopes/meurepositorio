package error;
	
public class ErrorLogin extends Exception {

	private static final long serialVersionUID = 1L;

	public final String ERRO_LOGIN = "Erro no Login!";
	public final String ERRO_SENHA = "Erro na Senha!";
	public final String ERRO_NOS_DADOS = "Erro nos dados!";
	
	private String message;

	public ErrorLogin(int n) {
		switch (n) {
		case 1:
			this.message = ERRO_LOGIN;
			break;
		case 2:
			this.message = ERRO_SENHA;
			break;
		case 3:
			this.message = ERRO_NOS_DADOS;
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
