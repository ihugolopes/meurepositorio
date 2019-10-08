package persistence;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Dao {
//Data Access Object
	  //php -- pdo 
	  //C# DAL
	Connection con;
	PreparedStatement stmt;
	Statement statement;
	ResultSet rs;
	CallableStatement call; //storedProcedure
	public void open() throws Exception{
      Class.forName("org.postgresql.Driver");
	  con = DriverManager.getConnection(
   "jdbc:postgresql://localhost:5432/bdheranca",
			  "postgres", "coti");
     }
	public void close() throws Exception{
		con.close();
	}

	public static void main(String[] args) {
		try {
			Dao d = new Dao();
			d.open();
			d.close();
			  System.out.println("Postgre Banco ok");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
