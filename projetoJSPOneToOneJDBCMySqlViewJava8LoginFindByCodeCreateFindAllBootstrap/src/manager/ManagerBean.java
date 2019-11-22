package manager;

import java.util.List;

import entity.Aluno;
import persistence.AlunoDao;

public class ManagerBean {

	private List<Aluno> lista;

	public List<Aluno> getLista() {
		try {
			lista = new AlunoDao().findAll();
		} catch (Exception ex) {
		}
		return lista;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}

}
