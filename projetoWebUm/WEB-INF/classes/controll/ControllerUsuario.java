package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;
import persistence.UsuarioDao;
 
@WebServlet("/ControllerUsuario")
public class ControllerUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ControllerUsuario() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = new Usuario(); //encasulando
                usuario.setNome(request.getParameter("nome"));
                usuario.setEmail(request.getParameter("email"));
                usuario.setSenha(request.getParameter("senha"));
         try {
            UsuarioDao dao = new UsuarioDao();
                           dao.create( usuario);
                           //msg = dados gravados
        	    request.setAttribute("msg","Dados Gravados");
        	       //sistema.jsp (volto  com a msg)
        	 request.getRequestDispatcher("sistema.jsp").
        	     forward(request, response);
        	
         }catch(Exception ex) {
        	 request.setAttribute("msg","error:" + ex.getMessage());
           	 request.getRequestDispatcher("error.jsp").
    	        forward(request, response); 
        }
	}
	
}
