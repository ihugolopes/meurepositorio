###Classe Aluno

package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Classe Completa J7
//Traz a Ordenação 
public class Aluno implements Serializable,Comparable<Aluno> {
	private static final long serialVersionUID = 1L;
	
	
	private Integer idAluno;
	private String nome;
	private String email;
	
	public Aluno() {
	}
	
	//equals, comparable, hashcode
	//Ordenar (Colocar os Recursos que ela aceita) ...
	
	
	
	public Aluno(Integer idAluno, String nome, String email) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
	}

	


	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", email=" + email + "]";
	}



	public Integer getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
     @Override
	public int hashCode() {
		int digitos = String.valueOf(this.idAluno).length();
    	 return digitos;
	}
	
	
	//Criar um Critério de Ordenação do Aluno
	// O Critério de Ordenacao será feito pelo Codigo ...
	@Override
	public int compareTo(Aluno a) {
		 //this com get (ascendente)
		//descendente se inverter (get com this
       return this.idAluno.compareTo(a.getIdAluno());
	}
	//Origem Interface::Comparable
	//equals vem da Herança de Object
	//casting
	//Classe ::Object
	@Override
	public boolean equals(Object o) {
		Aluno a = (Aluno) o;
		return this.idAluno.equals(a.getIdAluno());
	}
	
	
    public static void main(String[] args) {
    	Aluno a1= new Aluno(100,"jose","jose@gmail.com");
    	Aluno a2= new Aluno(100,"marcelo","marcelo@gmail.com");
    	Aluno a3= new Aluno(120,"leandro","leandro@gmail.com");
    	
	  System.out.println("Igualdade :" + a1.equals(a2));
	  //interface  lista  que chama a Classe
	  List<Aluno> lista = new ArrayList<Aluno>();
	     lista.add(a1);
	     lista.add(a2);
	     lista.add(a3);
	   Collections.sort(lista);
         System.out.println(lista);
         
     
         //Que não permite armazenar igual (duplicado)
         Set<Aluno> lista2 =  new  TreeSet<Aluno>();
          
         System.out.println(lista2.add(a1));
         System.out.println(lista2.add(a2));
         System.out.println(lista2.add(a3));
         
         System.out.println(lista2); 
       
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
  }
	
}


###