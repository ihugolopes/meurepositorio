package controll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import persistence.ProdutoDao;

@WebServlet("/ControllProduto")
public class ControllProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Produto> lista = new ProdutoDao().findAll(); // bd
			request.setAttribute("msg", lista);
		} catch (Exception ex) {
			request.setAttribute("msg", "Error Encontrado ...");
		} finally {
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
		}

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//resgata o codigo (Converte ele inteiro)
		 Integer codigo = new Integer(request.getParameter("codigo"));
		 Produto produto= new ProdutoDao().findByCode(codigo); //produto==null
		 
		   //SE PRODUTO NAO FOR ENCONTRADO MSG2 É PREENCHIDO
		    if (produto==null) {
		    	request.setAttribute("msg2", "Produto Nao Encontrado");	
		       }else {
     	 //SE PRODUTO NAO FOR ENCONTRADO LINHA É PREENCHIDA
			request.setAttribute("linha", produto);
		    }
		} catch (Exception ex) {
			request.setAttribute("msg2", "Error Encontrado ...");
		} finally {
			request.getRequestDispatcher("consulta.jsp").forward(request, response);
		}

	}

}
