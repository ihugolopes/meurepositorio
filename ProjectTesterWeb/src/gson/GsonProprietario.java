package gson;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;

import entity.Proprietario;

public class GsonProprietario implements IGsonProprietario {

	FileWriter fw;
	
	@Override
	public void open() throws Exception {
		fw = new FileWriter("C:/Users/hugo.lopes/Documents/tmp/proprietarios.json", true);
		
	}

	@Override
	public void create(List<Proprietario> proprietarios) throws Exception {
		fw.write(new Gson().toJson(proprietarios));
		fw.flush();
		
	}

	@Override
	public void close() throws Exception {
		fw.close();
		
	}

}
