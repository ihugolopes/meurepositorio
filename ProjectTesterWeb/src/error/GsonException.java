package error;

public class GsonException extends Exception{

	private static final long serialVersionUID = 1L;

	public static final String ERRO_GERAR_GSON = "Erro ao salvar no formato GSON!";
	
	private String message = ERRO_GERAR_GSON;

	public String getMessage() {
		return message;
	}
}
