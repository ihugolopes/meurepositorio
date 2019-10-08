package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Proprietario;
import persistence.LoginDao;
import persistence.ProprietarioDao;

@WebServlet("/ControllerListar")
public class ControllerListar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerListar() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
         	List<Proprietario> lista = null;
         
         	try{
        		ProprietarioDao alunoDAO = new ProprietarioDao();
             		lista = alunoDAO.findAll();
			request.setAttribute("listaAlunos", lista);
			response.sendRedirect("lista.jsp");		
         	} catch(Exception e ){
           		e.getMessage();
         	}  
     	}

//	protected void listar (HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
//        try{
//            request.setAttribute("listar", new LoginDao().findAll());
//            request.getRequestDispatcher("listap.jsp").forward(request,response);
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }finally {
//
//        }
//    }
}
