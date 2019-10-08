package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;
import persistence.UsuarioDao;

 
@WebServlet("/ControlleUsuario")
public class ControlleUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String cmd=request.getParameter("cmd");
	  if (cmd.equalsIgnoreCase("logar")) {
		 logar(request,response);
	  }else if(cmd.equalsIgnoreCase("gravar")) {
		  gravar(request,response); 
	  }
	  
	  
	  
	}
	
	
	protected void logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		  String senha = request.getParameter("senha");
		  Usuario usu = new Usuario();
		        usu.setEmail(email);
		         usu.setSenha(senha);
		         try {
		        	 UsuarioDao dao =new UsuarioDao();
		        	 Usuario resposta  = dao.findByLogin(usu);
		        	 if (resposta !=null) {
		        		  request.setAttribute("msg", "usuario Logado");
		        		  request.setAttribute("usuario", resposta);
		        		 if (resposta.getPerfil().equalsIgnoreCase("usu")) {
		        		   request.getRequestDispatcher("usu/logado.jsp")
		        		    .forward(request, response);
		        		 }else if(resposta.getPerfil().equalsIgnoreCase("adm")) {
		        			 request.getRequestDispatcher("adm/logado.jsp")
		        			  .forward(request, response);
		        		 }
		        	 }else { 
		        		  request.setAttribute("msg", "Dados Incorretos");
		        		  request.getRequestDispatcher("error.jsp")
		        		     .forward(request, response);

		        	 }
	      	 
		        	 
		           }catch(Exception ex) {
		      	  request.setAttribute("msg", "error:" + ex.getMessage());
               request.getRequestDispatcher("error.jsp")
       			  .forward(request, response);
		           }
	}
	
	
	
	protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			
	}
	
}
