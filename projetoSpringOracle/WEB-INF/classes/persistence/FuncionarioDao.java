package persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Funcionario;
import oracle.jdbc.OracleTypes;

public class FuncionarioDao  extends Dao{
	
	  public int gravar(Funcionario f) throws Exception{
		   open();
		     call = con.prepareCall("{  ?= call  grava(?,?,?,?)    }");
		         call.registerOutParameter(1, java.sql.Types.INTEGER);
		         call.setString(2,    f.getNome());
		         call.setDouble(3,   f.getSalario());
		         call.setString(4,    f.getEmail());
		         call.setString(5,    f.getSenha());
		    call.execute();
		    int chave = call.getInt(1);
		  close();
		  return chave;
 	  }
	  
	  public List<Funcionario> findAll() throws Exception{
		  open();
		   call = con.prepareCall("{call  ?:=  findAll }");
		       call.registerOutParameter(1, OracleTypes.CURSOR);
		       call.executeUpdate();
		       rs = (ResultSet) call.getObject(1) ;
		     List<Funcionario> lista = new ArrayList<Funcionario>(); 
		     while(rs.next()) {
		    	 Funcionario f = new Funcionario();
		    	  f.setId(rs.getInt(1));
		    	  f.setNome(rs.getString(2));
		    	  f.setSalario(rs.getDouble(3));
		    	  f.setEmail(rs.getString(4));
		    	  f.setSenha(rs.getString(5));
		    	   lista.add(f);
		     }
		      close();
		      return lista;
	  }
	  
	  

	  public static void main(String[] args) {
		try {
			
			FuncionarioDao dao = new FuncionarioDao();
//			Funcionario f =new Funcionario(null, "carlos",9000.,
//					"carlos@gmail.com", "123");
//		int resposta  =	dao.gravar(f);
//			if (resposta ==1) {
//				System.out.println("Dados Gravados");
//			}else {
//				System.out.println("Error ..");
//			}
			
			
			System.out.println(dao.findAll());
			
		}catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}
	  
	  
	  
	  
}
