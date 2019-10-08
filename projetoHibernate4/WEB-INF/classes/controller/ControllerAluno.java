package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aluno;
import entity.Endereco;
import persistence.AlunoDao;


@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControllerAluno() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String nome = request.getParameter("nome");
     String email = request.getParameter("email");
     String logradouro = request.getParameter("logradouro");
     String bairro = request.getParameter("bairro");
     String cidade = request.getParameter("cidade");
     String estado = request.getParameter("estado");
     String cep = request.getParameter("cep");
         Aluno a =new Aluno(null, nome,email);
         Endereco e = new Endereco(null,logradouro,bairro,cidade,estado,cep);
     try {   
       AlunoDao dao =new AlunoDao();
         dao.create(a, e);
        request.setAttribute("msg", "Dados Gravados ...");    	 
     }catch(Exception ex) {
         request.setAttribute("msg", "Error :" + ex.getMessage());
     }
     finally {
    	 request.getRequestDispatcher("sistema.jsp").forward(request, response);
     }
          
       
     
     
     
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
