package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao {
	
	
	
	 public void create(Produto p) throws Exception{
		  open();
		  stmt = con.prepareStatement("insert into produto values (null,?,?,?,?)");
		      stmt.setString(1, p.getNome());
		      stmt.setString(2, p.getDescricao());
		      stmt.setDouble(3, p.getPreco());
		      stmt.setInt(4, p.getPromocao());
  	  	    stmt.execute();
		  close();
	 }

	 public List<Produto>  findAll() throws Exception{
		  open();
		  stmt = con.prepareStatement("select * from produto");
		   List<Produto> lista = new ArrayList<Produto>();
		         rs =stmt.executeQuery();
		     while(rs.next()) {
		    	   Produto p = new Produto();
		    	                  p.setIdProduto(rs.getInt(1));
		    	                  p.setNome(rs.getString(2));
		    	                  p.setDescricao(rs.getString(3));
		    	                  p.setPreco(rs.getDouble(4));
		    	                 p.setPromocao(rs.getInt(5));
		    	                 lista.add(p);
		     }
		  close();
		  return lista;
	 }
	 
	 public Produto  findByCode(Integer cod) throws Exception{
		  open();
		    stmt = con.prepareStatement("select * from produto where idProduto=?");
		     stmt.setInt(1, cod);
		         rs =stmt.executeQuery();
		         Produto p= null;
		           if(rs.next()) {
		    	     p = new Produto();
		    	                  p.setIdProduto(rs.getInt(1));
		    	                  p.setNome(rs.getString(2));
		    	                  p.setDescricao(rs.getString(3));
		    	                  p.setPreco(rs.getDouble(4));
		    	                 p.setPromocao(rs.getInt(5));
		     }
		  close();
		  return p;
	 }
	
	

}
