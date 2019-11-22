package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public class UsuarioDao extends Dao {

	public void create(Usuario u) throws Exception {
		open();
		stmt = con.prepareStatement("insert into usuario values(null,?,?,?)");
		stmt.setString(1, u.getUserName());
		stmt.setString(2, u.getSenha());
		stmt.setString(3, u.getNome());
		stmt.execute();
		close();
	}

	public List<Usuario> findAll() throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario");
		List<Usuario> lista = new ArrayList<Usuario>();
		rs = stmt.executeQuery();
		while (rs.next()) {
			Usuario u = new Usuario();
			u.setIdUsuario(rs.getLong(1));
			u.setUserName(rs.getString(2));
			u.setSenha(rs.getString(3));
			u.setNome(rs.getString(4));
			lista.add(u);
		}

		close();

		return lista;
	}

	public static void main(String[] args) throws Exception {
		try {
			new UsuarioDao().create(new Usuario(null, "lucasa@gmail.com", "1234", "lucasa"));

			new UsuarioDao().findAll().stream().forEach(System.out::println);
			System.out.println("Dados Gravados ...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Fim.");

	}
}
