package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Carro;
import entity.Marca;
import persistence.CarroDao;

@WebServlet("/ControllerCarro")
public class ControllerCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerCarro() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		CarroDao cdao = new CarroDao();
		Carro c = new Carro();
		Marca m = new Marca();

		try {
			m.setCor(req.getParameter("cor"));
			m.setModelo(req.getParameter("modelo"));
			m.setAno(Integer.parseInt(req.getParameter("ano")));
			m.setChassi(req.getParameter("chassi"));
			m.setNomeDaMarca(req.getParameter("nomedamarca"));
			c.setVelocidadeMax(Integer.parseInt(req.getParameter("velocidademax")));
			c.tetoSolar(Boolean.parseBoolean(req.getParameter("tetosolar")));
			c.setNrMarchas(Integer.parseInt(req.getParameter("nrmarchas")));
			c.setCambioautomatico(Boolean.parseBoolean(req.getParameter("cambioautomatico")));
			c.setVolumeDeCombustível(Integer.parseInt(req.getParameter("volumedecombustivel")));
			c.setNport(Integer.parseInt(req.getParameter("nport")));

			cdao.create(c, m);

		} catch (Exception ex) {
			req.setAttribute("msg", "error: " + ex.getMessage());
		} finally {
			req.getRequestDispatcher("veiculo.jsp");
		}

	}

}
