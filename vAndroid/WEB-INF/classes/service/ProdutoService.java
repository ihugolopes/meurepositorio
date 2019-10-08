package service;

import java.util.Collections;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import entity.Produto;
import persistence.ProdutoDao;

@Path("/produto")
public class ProdutoService {
	//teste --Nao existe (se nao existit eu coloco Nome)
	@GET
	@Path("/gravar/{nome}/{descricao}/{preco}/{promocao}")
	 public String  gravar(@PathParam("nome") String nome,
			                                @PathParam("descricao") String descricao,
			                                @PathParam("preco") String preco,
			                                @PathParam("promocao") String promocao)
        throws Exception{
		 try {
			 Produto p = new Produto();
			                 p.setNome(nome);
			                 p.setDescricao(descricao);
			                 p.setPreco(new Double(preco));
			                 p.setPromocao(new Integer(promocao));
			       new ProdutoDao().create(p);
			       return "Dados Gravados ...";
		 }catch(Exception ex) {
		    return "Error : " + ex.getMessage();
		 }
	 }
	 
	//Default dele o Padrao Dele ...
	//Normal 
	@POST
	@Produces(MediaType.APPLICATION_JSON )
	@Consumes(MediaType.APPLICATION_JSON)
	public String gravarProduto(String produto) throws Exception{
		try {
	         Produto p = new Gson().fromJson(produto, Produto.class);	
		    new ProdutoDao().create(p);
		    return "Dados Gravados :" + p.toString();
		}catch(Exception ex) {
			return "Error :" + ex.getMessage();
		}
	}
	
	@GET
	public String  listar() throws Exception{
		 try {  
			  return   new Gson().toJson(new ProdutoDao().findAll());
		 }catch(Exception ex) {
	          return "Error " + ex.getMessage();
		 }
	}

	 
	@GET
	@Path("/{cod}")
	public String  buscarCodigo(@PathParam("cod") String  cod) throws Exception{
		 try {  
			  return   new Gson().toJson(new ProdutoDao().findByCode(new Integer(cod)));
		 }catch(Exception ex) {
	          return "Error " + ex.getMessage();
		 }
	}

	
	public static void main(String[] args) {
		try {
			
			
			
		}catch(Exception ex) {
		}
}
	
}
