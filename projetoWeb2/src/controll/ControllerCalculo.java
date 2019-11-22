package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerCalculo")
public class ControllerCalculo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ControllerCalculo() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Double numero1 = new Double(request.getParameter("numero1"));
			Double numero2 = new Double(request.getParameter("numero2"));
			String operacao = request.getParameter("operacao");
			Double resposta = 0.;

			if (operacao.equals("soma")) {
				resposta = numero1 + numero2;
				request.setAttribute("msg1", "Resultado:" + resposta);
			} else {
				request.setAttribute("msg1", "Erro no cálculo");
			}

		} catch (Exception ex) {
			request.setAttribute("msg1", "exceção");
		} finally {
			// retorna sempre
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
		}
	}

}
