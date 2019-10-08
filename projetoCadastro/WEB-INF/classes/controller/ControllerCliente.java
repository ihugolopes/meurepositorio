package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Cliente;
import persistence.ClienteDao;


@WebServlet("/ControllerCliente")
public class ControllerCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      Cliente c = new Cliente();
	     try {
	              c.setNome(request.getParameter("nome")); 
	              c.setEmail(request.getParameter("email"));
	               new ClienteDao().create(c);
  request.setAttribute("msg",
 "Cliente Cadastrado e necessario entrar no seu Email para Confirmar ...");
                   
	     }catch(Exception ex) {
	    	  request.setAttribute("msg", "Erro na Gravacao ...."); 	 
	     }finally {
	    	 request.getRequestDispatcher("cadastro.jsp").forward(request, response);
	     }
	     
	   		
	}

	
	
	
	
	
	
	
	
	
}
