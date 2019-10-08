package persistence;

import java.util.Date;

import entity.Cliente;

public class ClienteDao extends Dao{
	//\c banco
	
	public void create(Cliente c) throws Exception{
		open();
		stmt = con.prepareStatement
 ("insert into cliente (id,nome,email,sexo,dataNascimento) "
  + "values  (nextval('seq_cliente'),?,?,?,?)  ");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getSexo());
		java.sql.Date data = 
       new java.sql.Date(c.getDataNascimento().getTime());
		stmt.setDate(4, data); //gravando a data como date de BD
		 stmt.execute();
		close();
	}
	
	
	public static void main(String[] args) {
		try {
			// new Date(mes/dia/ano)--> java.util
     Cliente c = new Cliente(null,
    "matheus","matheus@gmail.com","m",new Date("02/10/2003"));
    		 new ClienteDao().create(c);		
			System.out.println("Dados Gravados ...");
		}catch(Exception ex) {
			System.out.println("Error :" + ex.getMessage());
			ex.printStackTrace();
		}
		//select * from cliente
		//select * from pessoa
		// \dt
		// \d cliente (describe)
		// \d pessoa
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
