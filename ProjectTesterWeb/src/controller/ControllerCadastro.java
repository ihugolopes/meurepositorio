package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Login;
import persistence.LoginDao;

@WebServlet("/ControllerCadastro")
public class ControllerCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerCadastro() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Login l = new Login();
		LoginDao dao = new LoginDao();

		try {
			l.setId(Integer.parseInt(req.getParameter("id")));
			l.setNome(req.getParameter("nome"));
			l.setEmail(req.getParameter("email"));
			l.setSenha(req.getParameter("senha"));

			try {
				dao.create(l);
			} catch (Exception ex) {
				req.setAttribute("msg", "Erro ao gravar!");
			}
			
			req.setAttribute("msg", "Cadastro Concluído com sucesso!");

		} catch (Exception ex) {
			req.setAttribute("msg", "error: " + ex.getMessage());
		} finally {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
