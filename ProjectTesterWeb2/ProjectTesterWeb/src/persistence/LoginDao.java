package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jcommon.encryption.SimpleMD5;

import entity.Login;

public class LoginDao extends Dao {

	public void create(Login l) throws Exception {
//		l.criptografaSenha();
		open();
		stmt = con.prepareStatement("insert into login values (null,?,?,?)");
		stmt.setString(1, l.getNome());
		stmt.setString(2, l.getEmail());
		stmt.setString(3, l.getSenha());
		stmt.execute();
		close();
	}

	public List<Login> findAll() throws Exception {
		open();
		List<Login> lista = new ArrayList<Login>(); // crio a lista
		stmt = con.prepareStatement("select * from login"); // consultar os dados
		rs = stmt.executeQuery(); // executando a consulta

		while (rs.next()) {
			Login u = new Login();
			u.setId(rs.getInt(1));
			u.setNome(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setSenha(rs.getString(4));
			lista.add(u);
		}

		close();
		return lista;

	}

	public void altera(Login login) {
		String sql = "update login set nome=?, email=?, senha=?," + "where id=?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(5, login.getId());
			stmt.setString(1, login.getNome());
			stmt.setString(2, login.getEmail());
//			stmt.setString(5, login.getPassword());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Login login) {
		try {
			stmt = con.prepareStatement("delete " + "from login where id=?");
			stmt.setLong(1, login.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public String logar(String email, String senha) throws Exception {
		String existe = "input";
		open();
		stmt = con.prepareStatement("SELECT * from login WHERE email = ? AND senha = ?");
		stmt.setString(1, email);
		stmt.setString(2, senha);
		rs = stmt.executeQuery();

		if (rs.next()) {
			existe = "sucess";
		}
		close();
		return existe;

	}

	public String gerarCriptografia(String senha) {
		SimpleMD5 md5 = new SimpleMD5(senha, "alongamentoDeSenha");
		senha = md5.toHexString();
		return senha;
	}

	public static void main(String[] args) throws Exception {
		LoginDao lg = new LoginDao();

		//LISTAR LOGINS
		try {
			System.out.println("Listando os logins: ");
			System.out.println(lg.findAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//LOGAR
		try {

			String result = lg.logar("hugo@gmail.com", "123");

			if (result == "sucess") {
				System.out.println("Loguei!");
			} else {
				System.out.println("Não loguei!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//CRIAR LOGIN
		String senha = "123";
		String senhaCriptografada = lg.gerarCriptografia(senha);
		Login novoL = new Login(null, "Samuel Caetano", "samuel@gmail.com", senhaCriptografada);
		
		try {
			lg.create(novoL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Login Criado" + novoL);
		System.out.println("Senha criptografada: " + novoL.getSenha());

	}

}
