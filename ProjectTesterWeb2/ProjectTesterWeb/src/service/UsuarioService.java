package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Usuario;
import persistence.Dao;

public class UsuarioService extends Dao {
	
	public void create(Usuario u) throws Exception {
		open();
		stmt = con.prepareStatement("insert into usuario values(null,?,?,?,?,?,?)");
		stmt.setString(1, u.getPrimeiroNome());
		stmt.setString(2, u.getUltimoNome());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getCpf());
		stmt.setString(5, u.getSexo());
		stmt.setString(6, u.getNumero());
		stmt.execute();
		close();
	}
	
	public List<Usuario> findAll() throws Exception {
		open();
		List<Usuario> lista = new ArrayList<Usuario>();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();

		while (rs.next()) {
			Usuario u = new Usuario();
			u.setIdUsuario(rs.getInt(1));
			u.setPrimeiroNome(rs.getString(2));
			u.setUltimoNome(rs.getString(3));
			u.setEmail(rs.getString(4));
			u.setCpf(rs.getString(5));
			u.setSexo(rs.getString(6));
			u.setNumero(rs.getString(7));

			lista.add(u);
		}

		close();
		return lista;
	}
	
	public void findById(int usu) {
		try {
			stmt = con.prepareStatement("select * from usuario where idUsuario=?");
			stmt.setInt(1, usu);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Usuario u) throws SQLException {
		stmt = con.prepareStatement(
				"update usuario set idUsuario=? primeiroNome=?, ultimoNome=?, email=?, cpf=?, sexo=?, numero=? where idUsuario=?");
		try {
			stmt.setString(1, u.getPrimeiroNome());
			stmt.setString(2, u.getPrimeiroNome());
			stmt.setString(3, u.getUltimoNome());
			stmt.setString(4, u.getEmail());
			stmt.setString(5, u.getCpf());
			stmt.setString(6, u.getSexo());
			stmt.setString(7, u.getNumero());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Usuario usuario) {
		try {
			stmt = con.prepareStatement("delete from usuario where idUsuario=?");
			stmt.setInt(1, usuario.getIdUsuario());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void deleteById(int usu) {
		try {
			stmt = con.prepareStatement("delete from usuario where idUsuario=?");
			stmt.setInt(1, usu);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws Exception {
		UsuarioService UsuarioService = new UsuarioService();
		Usuario p = new Usuario(6, "Carla", "Silva", "carlasilveira@gmail.com", "143.123.123-13", "m", "2312-1212");

		try {
			UsuarioService.findById(6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			System.out.println("Listando todos:");
			System.out.println(UsuarioService.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//try {
//UsuarioService.create(p);
//} catch (Exception e) {
//e.printStackTrace();
//}
//
//try {
//System.out.println("Listando todos:");
//System.out.println(UsuarioService.findAll());
//} catch (Exception e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}

//Proprietario p2 = new Proprietario(null, "Marcelo", "marcelo@gmail.com", "12345678911", "123456789", "27/08/2019");
//try {
//dao.altera(p2);
//} catch (SQLException e) {
//e.printStackTrace();
//}