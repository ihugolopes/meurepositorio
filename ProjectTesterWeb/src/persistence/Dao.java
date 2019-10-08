package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import error.ExceptionDao;

public class Dao {

	static Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void open() throws ExceptionDao {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testx?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "12345");
		} catch (Exception e) {
			throw new ExceptionDao(1);

		}

	}

	public void close() throws ExceptionDao, SQLException {
		try {
			con.close();
		} catch (Exception e) {
			throw new ExceptionDao(2);

		}
	}

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testx?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "12345");
			System.out.println("Conectado ao banco de dados com sucesso!");
		} catch (Exception e) {
			throw new ExceptionDao(0);

		}
	}

}
