package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ClienteDao;
import persistence.DtoClientePlano;


@WebServlet("/ControllerCliente")
public class ControllerCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String cmd = request.getParameter("cmd");
            if (cmd.equalsIgnoreCase("buscaCodigo")) {
            	buscaCodigo(request,response); //desce
            }
    
	}
	
	
	protected void buscaCodigo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          try {
        	  //o idCliente ira retornar em codigo (inteiro)
        	   Integer codigo = new Integer(request.getParameter("idCliente"));
        	   
        	   //Ao Inves do M
        	   //quando achar dto toString
		     DtoClientePlano dto= new ClienteDao().find().stream().
				   filter(c->c.getCliente().getId().equals(codigo)).
						    findAny().
						    orElse(null);
         //Estou imprimindo o Cliente e o plano 
		     //Ajax ...
		 response.getWriter().print(dto);
		
          }catch(Exception ex) {
        	  response.getWriter().print("Nao Encontrado ...");
          }
	   
	}

	
	
	
	

	
	
	
	
	
	
	

}
