package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import entity.Usuario;
import persistence.UsuarioDao;

@Path("/usuario")
public class ServiceUsuario {

	@GET
	public String listar() {
		try {
			return new Gson().toJson(new UsuarioDao().findAll());
		} catch (Exception ex) {
			return new Gson().toJson(null);
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response gravar(String usuario) {
		
		Usuario usu = new Gson().fromJson(usuario, Usuario.class);
		
		try {
			if (usu.getNome().equalsIgnoreCase("belem")) { //se tiver algo errado
				throw new Exception("error: Nome Invalido");
				
			}
			
			new UsuarioDao().create(usu); //salvando no banco de dados
			//converte o Objeto em JSON codigo 200(OK CERTO).. 500? DEU RUIM!
			//return new Gson()..toJson(usu);
			return Response.status(200).entity(usu).build();//com erro (acima sem numero de erro)
			
		}catch(Exception ex) {
//			String error = "{'msg':'}"+ex.getMessage()+"}";
//			return new Gson().toJson(error);
			return Response.status(500).entity(ex.getMessage()).build();
		}
		
	}
	
}
