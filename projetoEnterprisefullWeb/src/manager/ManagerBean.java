package manager;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import entity.Produto;
import persistence.ProdutoBean;

@ManagedBean(name="mb")
@ViewScoped
public class ManagerBean  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Produto produto;
	@Inject 
    private ProdutoBean  dao;
	//cdi {injecao de dependencia}]
	
	
	public ManagerBean() {
	    produto  = new Produto(); //espaço de MEM
	}
	
	public void gravar() {
		FacesContext fc = FacesContext.getCurrentInstance();
	   	try {
		  dao.create(produto); //gravando
		  produto =new Produto();  //limpar
		  fc.addMessage(null,new FacesMessage("Dados Gravados ...")); //mensagrm
		}catch(Exception ex) {
			fc.addMessage(null, new FacesMessage("Error ..." + ex.getMessage()) );
		}
	}

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoBean getDao() {
		return dao;
	}

	public void setDao(ProdutoBean dao) {
		this.dao = dao;
	}

}
