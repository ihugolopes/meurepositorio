package persistence;

import entity.Cliente;
import entity.Endereco;

public class EnderecoDao  extends Dao{
	
	
	public void createEndereco(Endereco e) throws Exception{
		ClienteDao dao= new ClienteDao();
		    dao.create(e.getCliente());
		    try {
		 open();
		  con.setAutoCommit(false);
		   stmt = con.prepareStatement("insert into endereco values (null,?,?,?,?,?,?)");
		   stmt.setString(1, e.getLogradouro());
		  stmt.setString(2, e.getBairro());
		  stmt.setString(3, e.getCidade());
		  stmt.setString(4, e.getEstado());
		  stmt.setString(5, e.getCep());
		  stmt.setInt(6, e.getCliente().getId());
		  stmt.execute();  
		  con.setAutoCommit(true);
		  close();
		    }catch(Exception ex){
		    	con.rollback();
		    }
    }
	
	public static void main(String[] args) {
		 try {
			 Cliente c = new Cliente(null,"marcio","marcio@gmail.com",1); //sempre ele grava cliente
			 Endereco e =
   new Endereco(null,"Av Rio Branco,185","Centro","Rio de Janeiro","RJ","20040007");
			    e.setCliente(c);
			 new EnderecoDao().createEndereco(e);
			  System.out.println("Dados Gravados ENdereco e Cliente");
		 }catch(Exception ex) {
			  ex.printStackTrace();
		 }
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
