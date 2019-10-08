package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ClienteDao;


@WebServlet("/AtivarConta")
public class AtivarConta extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try {
		  if (request.getParameter("email")!=null) {
			  String email =request.getParameter("email"); //resgata
	  new ClienteDao().ativarCliente(email); //ativa
	  response.getWriter().print("Cliente Ativado Com Sucesso");
			  }else {
	     response.getWriter().print("Email Nao Enviado ....");			  
		  }
	  }catch(Exception ex) {
		  response.getWriter().print("Error ...");
	  }
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
