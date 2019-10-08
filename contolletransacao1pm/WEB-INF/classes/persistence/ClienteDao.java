package persistence;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import entity.Cliente;
import entity.PlanoPagamento;

public class ClienteDao extends Dao {
	
	
	//IPC ... IPC ..IPC ... IPC .... IPC ...IPC
	 public void gravar(Cliente c, PlanoPagamento p) throws Exception{
		  open();
		  con.setAutoCommit(false);//desativando o commit ele nao consegue gravar
		    stmt = con.prepareStatement("insert into cliente values (null,?) ",
		    		   PreparedStatement.RETURN_GENERATED_KEYS
		    		);
		     stmt.setString(1, c.getNome()); 
		      stmt.execute() ; //gravei
		      rs = stmt.getGeneratedKeys(); //gerando a chave
		      Integer chave= null;
		     if (rs.next()) {
		    	 chave = rs.getInt(1);
		    	 c.setId(chave);
		     }
		    stmt.close();
		     stmt = con.prepareStatement("insert into planopagamento values (null,?,?,?) ");
		     stmt.setString(1, p.getNomePlano());
		     stmt.setDouble(2, p.getValor());
		     stmt.setInt(3, chave);
		   stmt.execute();
		   stmt.close();
		   con.setAutoCommit(true); //ou grava as duas ou nao grava niguem
		  close();
	 }
	
	 
	 
	  public List<DtoClientePlano> find() throws Exception{
        open();
		     stmt = con.prepareStatement("select * from VISAO");
		     List<DtoClientePlano> lista = new ArrayList<DtoClientePlano>();
		     rs = stmt.executeQuery(); 
		     while(rs.next()) {
		    	  Cliente c = new Cliente(); 
		    	             c.setId(rs.getInt(1));
		    	             c.setNome(rs.getString(2));
		    	    PlanoPagamento plano = new PlanoPagamento();
		    	          plano.setId(rs.getInt(3));
		    	          plano.setNomePlano(rs.getString(4));
		    	          plano.setValor(rs.getDouble(5));
		    	          plano.setCliente(c);
		    	          plano.getCliente().setId( rs.getInt(6));
		    	         DtoClientePlano dto = new DtoClientePlano(c,plano); 
		    	 lista.add(dto);
		     }
		 close();
		 return lista;
	  }
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
	 try {
//		  Cliente c = new Cliente(null, "ygor");
//		  PlanoPagamento pp = new PlanoPagamento(null,"prata", 400d);
 ClienteDao dao = new ClienteDao();
//		  
//		     dao.gravar(c, pp);
//		 
//		       System.out.println("Dados Gravados");
//		     
      dao.find().forEach(System.out::println);		 
		 
	 }catch(Exception ex) {
		     System.out.println("Error : "+ ex.getMessage());
		     ex.printStackTrace();
	 }
		 
		 
		 
	}
	
	

	 
	 
	 
	 
	 
	 
}
