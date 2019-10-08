package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import entity.Aluno;
import persistence.AlunoDao;

@Path("/aluno")
public class AlunoRest {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	 public String gravar(String aluno) {
		try {
			//Conversao de Json para Aluno
		  Aluno a  =new Gson().fromJson(aluno, Aluno.class);
		    //Grava os Dados de Aluno
		    new AlunoDao().create(a);

		    //Retorno em JSON
		    return new Gson().toJson(a);
		}catch(Exception ex) {
		  return "Error :" + ex.getMessage();	
		}
		
	}

	
	@GET
	 public String listar() {
		try {
		   return new Gson().toJson(new AlunoDao().findAll());
		}catch(Exception ex) {
		  return "Error :" + ex.getMessage();	
		}
	}
	
	
	
	@GET
	@Path("/code/{code}")
	public String  findByCode(@PathParam("code") String code) {
		 try {
			 Integer codigo = Integer.parseInt(code);
			 Aluno aluno = new AlunoDao().findByCode(codigo);
			 if (aluno==null) {
				 throw new Exception("Codigo Nao Encontrado");
			 }
			 return new Gson().toJson(aluno);
			 
		 }catch(Exception ex) {
			 String erro="{\"error\" : \"" + ex.getMessage() + "\"}";
			 return  erro;
		 }
	}
	

}
