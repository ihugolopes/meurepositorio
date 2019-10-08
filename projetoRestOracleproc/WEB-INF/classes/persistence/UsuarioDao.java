package persistence;

 

import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import dto.DtoUsuarioEndereco;
import entity.Endereco;
import entity.Usuario;

public class UsuarioDao  extends Dao{
	
	 
	    public int create(Usuario u) throws Exception{
	    	int busca=0;
	    	 open();
	    	 	call = con.prepareCall("{call ? := gravar(?,?,?,?,?,?,?) }");
	    	 	call.registerOutParameter(1, Types.INTEGER);
	    	 	call.setString(2, u.getNome());
	    	 	call.setString(3, u.getEmail());
	    	 	call.setString(4, u.getEndereco().getLogradouro());
	    	 	call.setString(5, u.getEndereco().getBairro());
	    	 	call.setString(6, u.getEndereco().getCidade());
	     		call.setString(7, u.getEndereco().getEstado());
	     		call.setString(8, u.getEndereco().getCep());
	     		call.executeUpdate();
	     		busca = call.getInt(1);
	     		close();
	     	 return busca;
	    }
	 
    public List <DtoUsuarioEndereco> findAll() throws Exception{
   	 open();
    	 call =con.prepareCall("{call ? := findAll }") ;
    	    call.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
    	    call.executeQuery();
    	  rs = (ResultSet) call.getObject(1);
     List<DtoUsuarioEndereco> lista = new ArrayList<DtoUsuarioEndereco>();
   	  while(rs.next()) {
   		  Usuario u = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
   		  Endereco e = new Endereco(rs.getInt(4), rs.getString(5),
   				    rs.getString(6),rs.getString(7), rs.getString(8),rs.getString(9),
   				   rs.getInt(10));
   		  DtoUsuarioEndereco dto = new DtoUsuarioEndereco(u, e);
   		  lista.add(dto);
   	  }
   	 close();
   	 return lista;
    }
	    
	    
	    
	    public static void main(String[] args) {
			 try {
			//	  Usuario u =new Usuario(null,"coringas","coringas@gmail.com");
		//		  Endereco e = 
 /// new Endereco (null,"Av Rio Branco, 185","Centro","Rio de janeiro","RJ","20040007");
	           //         u.setEndereco(e); //tem que setar antes de passar
	              //  int flag = new UsuarioDao().create(u);
	    //            if (flag==-1) {
	     //           	throw new Exception(" Erro na Gravacao ...");
	     //           }else {
	       //        	System.out.println("Dados Gravados ..."+ flag);
	        //        }
				 
    new UsuarioDao().findAll().forEach(System.out::println); 
				 
				 
			 }catch(Exception ex) {
				 ex.printStackTrace();
			 }
	    	
	    	
	    	
	    	
		}
	    
	    
	    
	    

}

