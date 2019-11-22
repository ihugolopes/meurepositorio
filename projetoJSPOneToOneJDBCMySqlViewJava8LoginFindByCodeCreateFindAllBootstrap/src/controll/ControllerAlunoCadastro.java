package controll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aluno;
import persistence.AlunoDaoOito;

@WebServlet("/ControllerAlunoCadastro")
public class ControllerAlunoCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerAlunoCadastro() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Aluno a = new Aluno();
			a.setNome(request.getParameter("nome"));
			a.setEmail(request.getParameter("email"));
			a.setSenha(request.getParameter("senha"));

			AlunoDaoOito dao = new AlunoDaoOito();
			dao.create(a);
			request.setAttribute("msg", "Dados Gravados");
		} catch (Exception ex) {
			request.setAttribute("msg", "gravacao invalida");
		} finally {
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
		}

	}

}
