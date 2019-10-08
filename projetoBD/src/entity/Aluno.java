package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import type.TypeCurso;

//Classe Completa J7
//Traz a Ordenação 
public class Aluno implements Serializable,Comparable<Aluno> {
	private static final long serialVersionUID = 1L;
	
	
	private Integer idAluno;
	private String nome;
	private String email;
	//Enum
	private TypeCurso curso; //Tipado ...
	  //OneToMany
	private List<Disciplina> disciplinas;
	
	
	public Aluno() {
	}
	
	//equals, comparable, hashcode
	//Ordenar (Colocar os Recursos que ela aceita) ...

	public Aluno(Integer idAluno, String nome, String email, TypeCurso curso) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
	}

	 

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", email=" + email + ", curso=" + curso
				+ ", disciplinas=" + disciplinas + "]";
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
	
	
 
	@Override
	public int compareTo(Aluno a) {
       return this.idAluno.compareTo(a.getIdAluno());
	}
  
	
	@Override
	public boolean equals(Object o) {
		Aluno a = (Aluno) o;
		return this.idAluno.equals(a.getIdAluno());
	}

	public TypeCurso getCurso() {
		return curso;
	}

	public void setCurso(TypeCurso curso) {
		this.curso = curso;
	}


	
	
	//trocar o set pelo adicionar ...
	
	
	
	 public void adicionar(Disciplina disciplina) {
		  if (this.disciplinas==null) {
			  this.disciplinas= new ArrayList<Disciplina>();
		  }
		 this.disciplinas.add(disciplina);
	 }

	 
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
    	Aluno a1= new Aluno(100,"jose","jose@gmail.com",
    			TypeCurso.TECNICO);
    	Aluno a2= new Aluno(100,"marcelo","marcelo@gmail.com",
    			TypeCurso.NORMAL);
    	Aluno a3= new Aluno(120,"leandro","leandro@gmail.com",
    			TypeCurso.TECNICO);
    	
    
    	
    	System.out.println(a2);
    	System.out.println("Curso :" + a2.getCurso().toString());
    	
    	
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
       
         
         
         //Set, List, Queue  Collection
         //Interface PRimeira desceu para List
         Collection <Aluno> lista3 = new ArrayList<Aluno>();
         
         
         //Collection
      //List, Set, Queue 
         
         //Mapa não é Collection porque ele grava sua propria Chave
         
      Map<Integer,String> mapa = new HashMap<Integer,String>();
       
      //Mapa Sobrescreve (Prevalesce) ...
       mapa.put(10,"michel");
       mapa.put(11,"jonatas");
       mapa.put(12,"leandro");
       mapa.put(10,"lu");
       
       System.out.println(mapa.get(10));
       

         
  }
	
}
