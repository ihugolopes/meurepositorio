package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Endereco;
import entity.Proprietario;
import persistence.EnderecoDao;
import persistence.ProprietarioDao;

@WebServlet("/ControllerTeste")
public class ControllerTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerTeste() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Proprietario p = new Proprietario();
		Endereco e = new Endereco();
		ProprietarioDao pdao = new ProprietarioDao();
		EnderecoDao edao = new EnderecoDao();

		try {
			p.setIdProprietario(null);
			p.setNome(request.getParameter("nome"));
			p.setCpf(request.getParameter("cpf"));
			p.setRg(request.getParameter("rg"));
			p.setEmail(request.getParameter("email"));
			p.setDataNascimento(request.getParameter("dataNascimento"));
			e.setRua(request.getParameter("rua"));
			e.setComplemento(request.getParameter("complemento"));
			e.setBairro(request.getParameter("bairro"));
			e.setCidade(request.getParameter("cidade"));
			e.setEstado(request.getParameter("estado"));
			e.setCep(request.getParameter("cep"));

			edao.create(e);
			pdao.create(p);

			request.setAttribute("msg", "Concluído");

		} catch (Exception ex) {
			request.setAttribute("msg", "error: " + ex.getMessage());
		} finally {
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
		}
	}
	
//	
//	public void ativarProprietario(String email) throws Exception {
//		open();
//		stmt = con.prepareStatement("update proprietario set ativo=1 where email=?");
//		stmt.setString(1, email);
//		stmt.executeUpdate();
//		close();
//		}

	
	
}
