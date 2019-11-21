package error;

public class ErrorLogin extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public static String mensagemErro1 = "Erro no Login!";
	public static String mensagemErro2 = "Erro na senha!";
	public static String mensagemErro3 = "Erro nos Dados!";
	
	private String message;

	public ErrorLogin(int n) {
		switch (n) {
		case 1:
			this.message = mensagemErro1;
			break;
		case 2:
			this.message = mensagemErro2;
			break;
		case 3:
			this.message = mensagemErro3;
			break;
		default:
			this.message = "Erro não Definido!";
			break;
		}
	}

	public String getMessage() {
		return message;
	}
}
