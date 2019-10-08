package manager;

import java.util.ArrayList;
import java.util.List;

import persistence.ClienteDao;
import persistence.DtoClientePlano;

public class ManagerBean {
	 //ManagerBean busca os dados do Banco de Dados
	 //via get ...
	
	 private List<DtoClientePlano> lista =   new ArrayList<DtoClientePlano>();

	public List<DtoClientePlano> getLista() {
		try {
		 lista = new ClienteDao().find();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return lista;
	}

	public void setLista(List<DtoClientePlano> lista) {
		this.lista = lista;
	} 
	 

	 
	 
}
