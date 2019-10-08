package error;

public class ExceptionDao extends Exception{

	private static final long serialVersionUID = 1L;

	public static final String ERRO_DAO = "Erro na conexão com o banco de dados!";
	public static final String ERRO_OPEN_DAO = "Erro ao abrir a conexão com o banco de dados!";
	public static final String ERRO_CLOSE_DAO = "Erro ao fechar a conexão com o banco de dados!";
	
	private String message;

	public ExceptionDao(int n) {
		switch (n) {
		case 0:
			this.message = ERRO_DAO;
			break;
		case 1:
			this.message = ERRO_OPEN_DAO;
			break;
		case 2:
			this.message = ERRO_CLOSE_DAO;
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
