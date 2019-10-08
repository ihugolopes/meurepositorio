package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
   //try e catch
     public void open() throws Exception{
    	                 //Driver = Banco de Dados
    	  Class.forName("com.mysql.jdbc.Driver");
    	   con = DriverManager.
  getConnection("jdbc:mysql://localhost:3306/bdloginum","root","coti");
     }
  
	
      public void close() throws Exception{
    	    con.close();    	  
      }
     
     
     
     
     
     
	
	
}
