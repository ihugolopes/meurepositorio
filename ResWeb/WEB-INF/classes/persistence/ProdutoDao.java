package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao{
	
	   public List<Produto> findAll() throws Exception{
	     open();
		    stmt = con.prepareStatement("select * from produto"); //lista produto
		    rs = stmt.executeQuery();
		    List<Produto> lista = new ArrayList<Produto>(); //cria a lista
		     while(rs.next()) { //enquanto existir alimenta a Lista
		     Produto p =new Produto();
		           p.setId(rs.getInt("id"));
		    	   p.setNomeProduto(rs.getString("nome"));
		    	   p.setPreco(rs.getDouble("preco"));
		    	   p.setImagem(rs.getString("imagem"));
		    	 lista.add(p);
		     }
		   close();
		   return lista;
	   }
	   
	   public Produto findByCode(Integer cod) throws Exception{
		     open();
			    stmt = con.prepareStatement("select * from produto where id=?");
			    stmt.setInt(1,   cod);
			    rs = stmt.executeQuery();
			    Produto p=null;
			     if(rs.next()) {
			     p=new Produto();
			           p.setId(rs.getInt("id"));
			    	   p.setNomeProduto(rs.getString("nome"));
			    	   p.setPreco(rs.getDouble("preco"));
			    	   p.setImagem(rs.getString("imagem"));
			     }
			   close();
			   return p;
		   }
	

	   
	   
}
