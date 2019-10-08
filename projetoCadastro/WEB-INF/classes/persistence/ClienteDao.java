package persistence;

import com.mysql.jdbc.PreparedStatement;

import entity.Cliente;

public class ClienteDao extends Dao{
	
	public void create(Cliente c)throws Exception{
		 open();
		  //null --Auto_increment
		 //0 porque falo que é inativo
		  stmt = con.prepareStatement("insert into cliente values (null,?,?, 0)",
             PreparedStatement.RETURN_GENERATED_KEYS 
				  );
		    stmt.setString(1, c.getNome());
		    stmt.setString(2, c.getEmail());
		     stmt.execute(); //gravar
		     rs = stmt.getGeneratedKeys(); //busca a chave gerada
		     if (rs.next()) {
		    	 c.setId(rs.getInt(1)); //Cliente passa a ter a chave que foi gerada para ele ...
		    	    //Só que o Cliente está sempre inativo ...
		     }
		 close();
	}
	 
	
	public void ativarCliente(String email) throws Exception{
		open();
		  stmt = con.prepareStatement
  ("update cliente  set ativo=1   where email=?");
		    stmt.setString(1, email);
		    stmt.executeUpdate();
		close();
	}
	


}
