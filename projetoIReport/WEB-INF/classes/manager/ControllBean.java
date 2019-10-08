package manager;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletResponse;

import entity.Funcionario;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperRunManager;
import persistence.DaoJdbc;
import persistence.FuncionarioDao;

@ManagedBean(name="mb")
@RequestScoped
public class ControllBean  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List <SelectItem> combo;
	
	private Funcionario funcionario;
		   public ControllBean() {
	   funcionario = new Funcionario();
	}
	   
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
	
	 public List<SelectItem> getCombo() {
		  combo = new ArrayList<SelectItem>();
		  FuncionarioDao dao = new FuncionarioDao();
		   for (Funcionario f : dao.findAll()) {
			     SelectItem  item = new SelectItem(f.getId(), f.getNome());
			     combo.add(item);
		   }
		return combo;
	}


	 
	public void setCombo(List<SelectItem> combo) {
		this.combo = combo;
	}

	public void  gravar() {
		 FacesContext fc = FacesContext.getCurrentInstance();
		 try {
			    new FuncionarioDao().create(funcionario); //gravou 
			     funcionario = new Funcionario(); //  limpou
			 fc.addMessage(  null, new FacesMessage( "Dados gravados ...") );
		 }catch(Exception ex) {
            fc.addMessage( null, new FacesMessage( "Error :" + ex.getMessage()) );
		 }
	 }
	
	 public void relatorio() {
		   FacesContext fc = FacesContext.getCurrentInstance();
		    try {
		    	HttpServletResponse response = 
		    	 		(HttpServletResponse) fc.getExternalContext().getResponse();
		    	FuncionarioDao dao = new FuncionarioDao();
		    	InputStream arquivo = (InputStream) fc.getExternalContext().
		    			getResourceAsStream("/relatoriotres.jasper");
   		 JRResultSetDataSource jrrs = 
				             new JRResultSetDataSource(new DaoJdbc().findReport());
			  byte [] converte = JasperRunManager.runReportToPdf(arquivo,null, jrrs);
			                 response.setContentType("application/pdf");
         response.setHeader("Content-Disposition","infile; filename=relatorionew.pdf");
           OutputStream out = response.getOutputStream();
			    out.write(converte);
			     out.flush();
                 out.close();
		    }catch(Exception ex) {
		       ex.printStackTrace();
		    }
	 }
	 
}
