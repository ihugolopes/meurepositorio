package json;

import java.io.FileWriter;
//java...  - text

import com.google.gson.Gson;

import model.Cliente;
import model.Endereco;

public class GravarJson {

	FileWriter ws;
	
	 public void abrir() throws Exception{
	   ws= new FileWriter("c:/tmp/dados.json",false);
		 
	 }
	 public void write(Endereco e)throws Exception{
	    ws.write(new Gson().toJson(e));
		ws.flush(); 
	 }
	 
	 
	 public void close()throws Exception{
	    ws.close();	 
	 }
	

	 public static void main(String[] args) {
   try {
		 Cliente x= 
         new Cliente(100, "pedro","pedro@gmail.com"); 
	     Endereco e = 
  new Endereco(200, "rua a", "centro", "RJ", "RJ","111222");
          e.setCliente(x);
          //logo ele tem endereco e cliente
	     GravarJson gravar= new GravarJson();
	         gravar.abrir();
	         gravar.write(e);
	         gravar.close();
	     
   System.out.println("Dados Gravados ...");
	     
   }catch(Exception ex) {
	   ex.printStackTrace();
   }
	 

   }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
