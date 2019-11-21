package entity;

import java.sql.SQLException;
import org.jcommon.encryption.SimpleMD5;
import persistence.LoginDao;

public class Login {

	private Integer id;
	private String nome;
	private String email;
	private String senha;

	public Login() {
	}

	public Login(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void criptografaSenha() {
		String chave = "passandoalongamentodasenha;passandooutravezalongamentodasenha";
		SimpleMD5 md5 = new SimpleMD5(getSenha(), chave);
		setSenha(md5.toHexString());
	}
	
	public void decriptografaSenha() {
		String chave = "passandoalongamentodasenha;passandooutravezalongamentodasenha";
		SimpleMD5 md5 = new SimpleMD5(getSenha(), chave);
		setSenha(md5.toHexString());
	}

	public static void main(String[] args) throws SQLException {
		LoginDao dao = new LoginDao();
		String senhaCriptografada = dao.gerarCriptografia("123");
		Login l = new Login(null, "Hugo Lopes", "hugocripto@gmail.com", senhaCriptografada);
		
		try {
			dao.create(l);
			System.out.println(l);
			l.criptografaSenha();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Senha criptografada: " + l.getSenha());
	}
}
