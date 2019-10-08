package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	protected static Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	public void open() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/strutsteste?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public void close() throws Exception, SQLException {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());

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
			System.out.println(e.getMessage());

		}
	}

}
