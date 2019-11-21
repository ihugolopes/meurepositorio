package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerUsuario")
public class ControllerUsuario extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ControllerUsuario() {
		super();
	}

	protected void doGet(HttpServletRequest request,  HttpServletResponse response)
			throws ServletException, IOException {
			// response.getWriter().println("bem 
//			vindo:"+request.getParameter("nome"));
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println (console)
		// response.getWriter().println(no Servlet)
		response.getWriter().println("bem vindo:" + request.getParameter("nome"));
	}

}
