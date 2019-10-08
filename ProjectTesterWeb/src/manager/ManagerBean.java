package manager;

import java.util.List;

import entity.Proprietario;
import persistence.ProprietarioDao;

public class ManagerBean {
	
	private List<Proprietario> proprietarios;

    public ManagerBean() {
    }

    public List<Proprietario> getTorcedores() {
        try{
        	ProprietarioDao pd = new ProprietarioDao();
        	proprietarios = pd.findAll();
        }catch(Exception e){

        }
        return proprietarios;

    }


}
