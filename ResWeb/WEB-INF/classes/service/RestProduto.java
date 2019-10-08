package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import persistence.ProdutoDao;


@Path("/produto")
public class RestProduto {
	// rodei pelo projeto
	//rs/produto
	//rs/produto (Lista o Primeiro)
	@GET
	 public  String  buscarTodos() {
		try {
          return    new Gson().toJson(new ProdutoDao().findAll());
		}catch(Exception ex) {
			return "Dados Nao Encontrados";
		}
	 }
	
	//rs/produto/chave/coti1234 (Lista o Primeiro)
	@GET
	@Path("/chave/{chave}")
	 public  String  buscarTodos(@PathParam("chave") String chave) {
		try {
			 if (chave.equalsIgnoreCase("coti1234")) {
                return    new Gson().toJson(new ProdutoDao().findAll());
			}else {
                return    "Acesso Negado ...";
			 }
		}catch(Exception ex) {
			return "Dados Nao Encontrados";
		}
	 }
	
	@GET
	@Path("/create")
	public String create() {
		StringBuffer sb = new StringBuffer();
		sb.append("<h2>Gravar PRoduto</h2>");
		sb.append("<form method='post'  action='Controle'>");
		 sb.append("Nome<br/>");
		 sb.append("<input type=text     name='nomeproduto' value='' />");		
		 sb.append("<br/>Preco<br/>");
		 sb.append("<input type=number  name='preco' value='' />");
		 sb.append("<br/>Imagem<br/>");
		 sb.append("<input type=text  name='imagem' value='' /><br/>");
		 sb.append("<button type=submit>Gravar</button> ");
		sb.append("</form>");
		return sb.toString();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
