package persistence;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import adapter.ClienteAdapter;
import entity.Cliente;

public class ClienteDao  extends Dao{
	
	public static final String CLIENTE="cliente";

	public void save(Cliente c)throws Exception{
			    MongoCollection <Document> coll= 
			    		getDB().getCollection(CLIENTE);
		coll.insertOne(ClienteAdapter.paraDocumento(c));
			   close();
	 }
	 

	 public List<Cliente> findAll() throws Exception{
		 MongoCursor <Document> cursor= null;
	      List<Cliente> lista  = null;
		    MongoCollection <Document> coll= 
			    		getDB().getCollection(CLIENTE);
			     cursor = coll.find().iterator();
			      lista = new ArrayList<Cliente>();
			     while(cursor.hasNext()) {
			    	 lista.add(ClienteAdapter.paraObjeto(cursor.next()));
			     }
			      cursor.close();
			      close();
			     return lista;
	 }
	
	 
 public static void main(String[] args) {
	try {
		ClienteDao dao = new ClienteDao();
		  
		   Cliente c =new Cliente(200.,"noah","noah@gmail.com", 1.);
		
		   dao.save(c);
		   System.out.println("Dados Gravados ..." );
		  //System.out.println("Listagem :" + dao.findAll());
		
	}catch(Exception ex) {
		System.out.println("Error :" + ex.getMessage());
		ex.printStackTrace();
	}
	 
	 
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	

}
