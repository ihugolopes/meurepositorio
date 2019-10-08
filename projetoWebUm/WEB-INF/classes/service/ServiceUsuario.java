package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import persistence.UsuarioDao;
//rs/usuario/fakelogin/belem/123
//service
@Path("/usuario")
public class ServiceUsuario {
	//Consultar
	@GET 
	@Path("/fakelogin/{login}/{senha}")
	public String fakeLogin(@PathParam("login")String login,
			                           @PathParam("senha")String senha
			 ) {
		 if (login.equals("teste") && senha.equals("teste")) {
			 return "Logado com Sucesso ... Parabens ";
		 }else {
			 return "Nao Logado Com Sucesso no Fakelogin";
		 }
	}
	
	
	@GET
	public String  usuario() {
		try {
			   //busca no banco e converte em JSON ...
			return new Gson().toJson(new UsuarioDao().findAll());
		}catch(Exception ex) {
			return "Error :" + ex.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
