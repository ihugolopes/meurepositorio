package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Proprietario;
import error.ExceptionDao;

public class ProprietarioDao extends Dao {

	public void create(Proprietario p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into proprietario values(null,?,?,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getEmail());
		stmt.setString(3, p.getCpf());
		stmt.setString(4, p.getRg());
		stmt.setString(5, p.getDataNascimento());
		stmt.execute();
		close();
	}

	public List<Proprietario> findAll() throws Exception {
		open();
		List<Proprietario> lista = new ArrayList<Proprietario>(); 
		stmt = con.prepareStatement("select * from proprietario");
		rs = stmt.executeQuery();

		while (rs.next()) {
			Proprietario u = new Proprietario();
			u.setIdProprietario(rs.getInt(1));
			u.setNome(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setCpf(rs.getString(4));
			u.setRg(rs.getString(5));
			u.setDataNascimento(rs.getString(6));

			lista.add(u);
		}

		close();
		return lista;
	}
	
//	public void altera(Proprietario p) throws SQLException {
//		stmt = con.prepareStatement( "update proprietario set idProprietario=? nome=?, email=?, cpf=?, rg=?, dataNascimento=? where cpf=?");
//        try {
//            stmt.setString(1, p.getNome());
//            stmt.setString(2, p.getEmail());
//    		stmt.setString(3, p.getCpf());
//    		stmt.setInt(4, p.getRg());
//    		stmt.setString(5, p.getDataNascimento());
//            stmt.execute();
//            stmt.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
	
	
	public void remove(Proprietario proprietario) {
        try {
            stmt = con.prepareStatement("delete from proprietario where id=?");
            stmt.setInt(1, proprietario.getIdProprietario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


	
	public static void main(String[] args) throws ExceptionDao {
		ProprietarioDao dao = new ProprietarioDao();
//		Proprietario p = new Proprietario(null, "Marcelo", "marcela@gmail.com", "12345678911", "123456789", "27/08/2019");
//		try {
//			dao.create(p);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println("Listando todos:");
			dao.findAll();
			System.out.println(dao.findAll());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Proprietario p2 = new Proprietario(null, "Marcelo", "marcelo@gmail.com", "12345678911", "123456789", "27/08/2019");
//		try {
//			dao.altera(p2);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}

}
