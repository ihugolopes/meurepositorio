package manager;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entity.Cliente;
import persistence.ClienteDao;

@ManagedBean(name="mb")
@RequestScoped
public class ManagerBean {
	  private Cliente cliente;
	  private List<Cliente> clientes;
	  
	  public ManagerBean() {
   	   cliente = new Cliente();
	}
        //profedsonbelem@gmail.com
	  
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		try {
		 clientes =new ClienteDao().findAll();
		}catch(Exception ex){
			 ex.printStackTrace();
		}
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void gravar() {
		 FacesContext fc = FacesContext.getCurrentInstance();
		 try {
			  ClienteDao dao = new ClienteDao();
			     cliente.setAtivo(1.);
			   dao.save(cliente);
			 fc.addMessage(null, new FacesMessage("Gravar ..." + cliente));
			   cliente = new Cliente();
		 }catch(Exception ex) {
			 fc.addMessage(null, new FacesMessage("Error ..." + ex.getMessage()));
		 }
	}
	

}
