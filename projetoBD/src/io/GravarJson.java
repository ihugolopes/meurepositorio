package io;
import java.io.FileWriter;

import com.google.gson.Gson;
//na Interface era Generic 
//e de Generic ele virou tipado ..
import entity.Aluno;
import entity.Disciplina;
import type.TypeCurso;
public class GravarJson  implements IGravarJson<Aluno>{

 FileWriter fr;
	@Override
	public void open() throws Exception {
     fr = new FileWriter("/tmp/alunos.json",false);
	}
	
	
	@Override
	public void write(Aluno a) throws Exception {
		 fr.write(  new Gson().toJson( a )   ); 
		 fr.flush();
	}
	@Override
	public void close() throws Exception {
		fr.close();
	}
	
 public static void main(String[] args) {
		Aluno a = 
    new Aluno(1,"marcio","marcio@gmail.com",TypeCurso.TECNICO);
 		Disciplina d1 =new Disciplina(20,"java",7.,9.);
		           d1.gerarMedia();
		           d1.gerarSituacao();
	      a.adicionar(d1);
         a.adicionar(new Disciplina(21,"angular",8.,10.)
	    		 .gerarMedia().gerarSituacao() ); 
	 
	try {
		GravarJson json = new GravarJson();
		 json.open();
		 json.write(a);
        json.close();		
         System.out.println("Dados Gravados em Json");
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	 
	 
	 
	 
}	
	
	
	
	
	
	
	
	
	
	
}
