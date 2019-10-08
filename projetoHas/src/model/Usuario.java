package model;

public class Usuario extends Pessoa {

	public Usuario(Integer id, String nome, String email) {
		setIdPessoa(id);
		setNome(nome);
		this.email = email;
		interceptor();
	}

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		try {
			Usuario u = new Usuario(1234, "teste", "tu@gmail.com");

			System.out.println("Acesso autorizado:" + u.getNome());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
