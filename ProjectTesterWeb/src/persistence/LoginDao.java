package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Login;

public class LoginDao extends Dao {

	public void create(Login l) throws Exception {
//		l.criptografaSenha();
		open();
		stmt = con.prepareStatement("insert into login values (?,?,?,?)");
		stmt.setInt(1, l.getId());
		stmt.setString(2, l.getNome());
		stmt.setString(3, l.getEmail());
		stmt.setString(4, l.getSenha());
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
			stmt.setString(5, login.getSenha());
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

	public Boolean login(String email, String senha) throws Exception {
		boolean existe = false;
		open();
		stmt = con.prepareStatement("SELECT * from login WHERE email = ? AND senha = ?");
		stmt.setString(1, email);
		stmt.setString(2, senha);
		rs = stmt.executeQuery();

		if (rs.next()) {
			existe = true;
		}
		close();
		return existe;
		
	}

	public static void main(String[] args) {
		LoginDao lg = new LoginDao();
		try {
			System.out.println("Listando os logins: ");
			System.out.println(lg.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
//			lg.login("giordano@gmail.com", "123");

			if (lg.login("giordano@gmail.com", "123") == true) {

				System.out.println("Loguei!");
			} else {
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
