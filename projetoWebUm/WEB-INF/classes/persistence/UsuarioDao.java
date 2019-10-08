package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public class UsuarioDao extends Dao{
	
	   public void create(Usuario u) throws Exception{
		      u.gerarCriptografia();
		    open();
		      stmt = con.
   prepareStatement("insert into usuario values (null,?,?,?)");
		      stmt.setString(1, u.getNome());
		      stmt.setString(2, u.getEmail());
		      stmt.setString(3, u.getSenha());
		     stmt.execute();
		   close();
	   }
	   //Consulta  a sua Base de dados ...
	   public List<Usuario> findAll() throws Exception{
		    open(); //abro o banco
		    List<Usuario> lista = new ArrayList<Usuario>(); //crio a lista
		    stmt =con.prepareStatement("select * from usuario"); //consultar os dados
		    rs = stmt.executeQuery(); //executando a consulta
		   while(rs.next()) {
			 Usuario u = new Usuario();
			          u.setId(rs.getLong(1));
			          u.setNome(rs.getString(2));
			          u.setEmail(rs.getString(3));
			          u.setSenha(rs.getString(4));
			     lista.add(u);
		   }
		   close();
		   return lista;
	   }

	   public static void main(String[] args) {
		try {
			UsuarioDao dao = new UsuarioDao();
			   Usuario u = new Usuario(null,"edio","edio@gmail.com","123");
			   
			    new UsuarioDao().create(u);
			     
			     System.out.println("Dados Gravados do Usuario");
			
		}catch(Exception ex) {
			    ex.printStackTrace();
		} 
   
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
