package persistence;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Arquivo;

public class FileDao extends Dao {

	public Integer inserirArquivo(Arquivo f) {
		int x = 0;

		try {
			open();
			InputStream is = new ByteArrayInputStream(f.getArquivo().getBytes());

			stmt = con.prepareStatement(
					"INSERT INTO arquivopdf ( idarquivo, nomearquivo, arquivo) VALUES (null, ?, ? )",
					Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, f.getNomearquivo());
			stmt.setBlob(2, is);
			stmt.executeUpdate();
			ResultSet generatedKeys = stmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				x = (int) generatedKeys.getLong(1);
			} else {
				throw new SQLException("Creating user failed, no ID obtained.");
			}

			stmt.close();
			close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return x;
	}

	public File buscarArquivo(int id) throws Exception {
		open();
		File f = null;
		try {
			stmt = con.prepareStatement("SELECT idarquivo, nomearquivo, arquivo FROM arquivopdf WHERE idarquivo=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				byte[] bytes = rs.getBytes("arquivo");
				String nome = rs.getString("nomearquivo");

				f = new File(nome);
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(bytes);
				fos.close();
			}
			rs.close();
			stmt.close();
			close();
			return f;
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
//		FileDao dao = new FileDao();
//		try {
//		File f = dao.buscarArquivo(1);
//		File a = new File("META-INF" + "arquivo.pdf");
//		System.out.println(f);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}
