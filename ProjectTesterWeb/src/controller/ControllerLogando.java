package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.LoginDao;

@WebServlet("/ControllerLogando")
public class ControllerLogando extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerLogando() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LoginDao lg = new LoginDao();
		CLogar cl = new CLogar();

		try {
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");
			String senhaMD5 = cl.gerarCriptografia(senha);

			if (lg.login(email, senhaMD5) == true) {
				req.getRequestDispatcher("sistema.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "Dados Incorretos!");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
