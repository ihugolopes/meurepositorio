package gson;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;

import entity.Marca;

public class GsonMarcas implements IGsonMarcas {

	FileWriter fw;

	@Override
	public void open() throws Exception {
		fw = new FileWriter("C:/Users/hugo.lopes/Documents/tmp/teste.json", true);

	}

	@Override
	public void create(List<Marca> marcas) throws Exception {
		fw.write(new Gson().toJson(marcas));
		fw.flush();

	}

	@Override
	public void close() throws Exception {
		fw.close();

	}

}
