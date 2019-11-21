package entity;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import persistence.ClienteDao;

public class ListarSeguradosAction extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	
	List<Cliente> clientes;

	public String execute() throws Exception {

		ClienteDao cd = new ClienteDao();
		try {
			clientes = cd.findAll2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		return SUCCESS;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}