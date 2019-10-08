package service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import entity.Produto;
import persistence.ProdutoBean;

@Path("produto")
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoService {
	
   @Inject
   private  ProdutoBean dao;
   
     @GET
    public List<Produto> findAll() {
    	return dao.findAll();
    }

      @GET
      @Path("/{id}")
      public Response find(@PathParam("id") Integer id) {
    	         Response response = null;
    	         try {
    	        	 Produto produto = dao.findByCode(id);
    	        	   if (produto==null) {
                   response = createResponse(Status.OK,"Resultado por Pesquisa",
		                  MediaType.TEXT_PLAIN_TYPE );
    	        	   }
    	        	   else {
    	        		   response =createResponse(Status.OK, produto);
    	        	   }
    	         }catch(Exception ex) {
    	        	   response =createResponse(Status.INTERNAL_SERVER_ERROR,
    	        			                                   "Error :" + ex.getMessage());
    	         }
    	         return response;
      }
     
     public Response  createResponse(Status status, Object value) {
    	    return createResponse(status, value, MediaType.APPLICATION_JSON_TYPE);
     }
    
     
      public Response createResponse(Status status, Object value,  MediaType media) {
    	   return Response.status(status).entity(value).type(media).build();
      }
   
   
   
   
   
   
    
}
