package io;

import java.io.FileWriter;
import java.util.List;
import com.google.gson.Gson;
import entity.Aluno;

//time 
public class GravarJson implements IJson {
	// protected ou default ...
	FileWriter fw;

	// false(sobrscreve)
	// true(adiciona)
	@Override
	public void open() throws Exception {
		fw = new FileWriter("c:/tmp/javaalunos.json", false);
	}

	// passa lista grava e converte em JSON
	@Override
	public void write(List<Aluno> alunos) throws Exception {
		fw.write(new Gson().toJson(alunos));
		fw.flush();
	}

	// fecha
	@Override
	public void close() throws Exception {
		fw.close();
	} 

	public static void main(String[] args) {
		try {
			Aluno a = new Aluno();
			GravarJson json = new GravarJson();
			a.ordenar();

			json.open();
			json.write(a.getAlunos());
			json.close();

			System.out.println("Dados Gravados ...");
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}
}
