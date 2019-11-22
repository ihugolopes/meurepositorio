Livros
blogedsonbelem.com.br
Aulas são documentads _

 lucianamedeiros.coti@gmail.com
 julianamota.coti@gmail.com

-----  ( redes sociais)
 profedsonbelem@gmail.com

=====================================

98199-0108 (belem)

98201-2525 (luciana)

98214-1825 (juliana)

=====================================

 encapsulamento
 oo ser (herança) /herdar
 ter  ()_ umparaum / umparamuitos / muitosparamuitos / auto-relacionamento
======================================

Main _  OBS ...
 Não é local de programação ...

 escreve tudo no Main (perdido ou cego) ...

====================================================
 martin fowler

======

kathy sierra( certificação )
java 8 herbert schildt 






========================
class Cliente
==============================
package model;

import java.io.Serializable;

// implements Seializable _ persistis (gravar)
//serializo para poder gravar ...
public class Cliente implements Serializable {
//os campos são fechados
//atributos	_ Long _ 64
	 //Byte, Short, Integer, Long
	 // byte, short, int, long (primitivo)
	 //caixa Alta (wrapper)
	private Long    id; //id = 10L;
	private String  nome; //tipo texto
	private String  email;
	private String  sexo;
	//somente a classe visualiza 
	//protected fechado ao diretorio
	//default fechado ao diretorio
	//public métod (retorno e nao retorno void) 
	//(procedure e function)
	
	//encapsulamento (set entrada) e get (saída) 
	
	 //this (da Classe)
	//Alguem irá buscar o valor do id
	public Long getId() {
		return  this.id;
	}
	
	//o parametro alimenta o atributo
	public void setId(Long pid) {
		this.id = pid;
	}
	
	
	
	
	
	
	
	
}



//==============================

package model;

import java.io.Serializable;


public class Cliente implements Serializable {

	private Long    id; 
	private String  nome; 
	private String  email;
	private String  sexo;
	//alt + s (generate getters and setters)
	public Long getId() {
		return id;
	}
	
	//encapsula com ao inves do void (Classe)
	//return this
	//cascata ( Programacao no modo cascata) cascade
	//Builder ...
	
	//método para proteger ...
	public Cliente setId(Long id) {
		this.id = id;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Cliente setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public String getSexo() {
		return sexo;
	}
	public Cliente setSexo(String sexo) {
		this.sexo = sexo;
		return this;
	}
	

	//main ctrl + espaço e enter
	public static void main(String[] args) {
		//classe objeto = new Construtor()
		//new (espaço de mem) Construtor ...
	
		  //c nada mais é que a execuçao da classe cliente
		  //Classe  objeto    espaçodemem   Construtor...
 		Cliente      c     =   new          Cliente();
		
		//c.setNome("ju");
		//c.setEmail("ju@gmail.com");
		
			
		   c.setNome("jose").
		        setEmail("jose@gmail.com").
		         setId(1000l).
		           setSexo("m");
		        
		   //imprimindo o nome
   System.out.println(c.getNome() + "\n" + c.getEmail());
	  //syso + ctrl + espaço
      //sysout (imprimir) JSE
   //\t (lado)  tab
   //\n Abaixo
   //selecionei tudo  (ctrl + shift + c)
   //comentario
   //cafe
		
		
		
	}

	
}

==============================


package model;

import java.io.Serializable;

public class Aluno implements Serializable{

	 private Long id;
	 private String nome;
	 private Integer idade; //representacao ...
	 //private String disciplina[]; 
	 //vetor  ...
	 private Double notas[]; //vetor 
	
	 //encapsulamento 
	 //encapsular por construtor
	 
	 
	public Long getId() {
		return id;
	}
	public Aluno setId(Long id) {
		this.id = id;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public Aluno setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Integer getIdade() {
		return idade;
	}
	public Aluno setIdade(Integer idade) {
		this.idade = idade;
		return this;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	//ao inves do vetor [] utiliza varargs ...
	
	public void setDisciplinas(String ...disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Double[] getNotas() {
		return notas;
	}
	public void setNotas(Double ...notas) {
		this.notas = notas;
	}
	 
	public static void main(String[] args) {
		
		Aluno a= new Aluno();
		 a.setId(100L).
		      setNome("ricardo").setIdade(20);
	//vetor	 
//a.setDisciplinas(new String[] {"java","ionic","angular"});
	 a.setDisciplinas("java","angular");		 
		 
		 int pos=0;
		 for(String s : a.getDisciplinas()) {
			 System.out.println(s + ", pos=" +pos++);
		 }
		 
		 
		for (int i=0;i<a.getDisciplinas().length;i++) {
    System.out.println(a.getDisciplinas()[i] + ",pos=" + i);
		}
		 
		
		String curso="angular,java,node";
		String dados[]= curso.split(",");

		for(int i=0;i<curso.length();i++) {
			System.out.println(curso.substring(i,i+1));
		}
		 //retirar o ln ( imprimindo em colunas)
		
		 for(String x : dados) {
			 System.out.println(x);
		 }
		
		//Duvidas ?
	   //se aprofundar em ..
    //Token , Varargs, foreach ... Treinar ...
		 
	
	
		
	}
	 
	 
	 
	 
}
		 		 

