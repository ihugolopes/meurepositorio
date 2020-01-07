package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	PreparedStatement stmt;
	Connection con;
	ResultSet rs;
	
	public void open() throws Exception {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/desafioestagiosc", "postgres", "12345");
	}
	
	public void close() throws Exception {
		con.close();
	}

	public static void main(String[] args) {
		Dao dao = new Dao();
		try {
			dao.open();
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

