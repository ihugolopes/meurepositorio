package manager;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entity.Funcionario;
import persistence.FuncionarioDao;

//Nome do ManagerBean = mb
@ManagedBean(name="mb")
@RequestScoped  //scope (request, session, view)
public class ManagerBean {
	
	 private Funcionario funcionario; 
	   //Objeto  OO
	public ManagerBean() {
		 //dando espaço de mem na mao
		this.funcionario = new Funcionario(); //estou inicializando o Objeto FUNCIONARIO
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	public void gravar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			int resposta =  new FuncionarioDao().gravar(this.funcionario);
			
			  if (resposta==1) {
		     fc.addMessage(null, new FacesMessage("Ok  ... Dados Gravados"));
			  }else {
				throw new Exception("Nao Gravado ...");
		      }
         }catch(Exception ex) {
		    fc.addMessage(null, new FacesMessage(null,
		    		             "Error :" + ex.getMessage()));
		}
	}
	
	
}
