package entity;

import type.TypeCurso;

public class Disciplina {

	private Integer id;
	private String disciplina;
	private Double nota1;
	private Double nota2;
	private transient Double media;
	private  String situacao;
	//ManyToOne
	private Aluno aluno;

	
	
	public Disciplina() {
	}

	public Disciplina(Integer id, String disciplina,
			Double nota1, Double nota2) {
		super();
		this.id = id;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", media=" + media + ", situacao=" + situacao + "]";
	}







	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

	public Disciplina gerarMedia() {
		 this.media= (this.nota1 + this.nota2)/2;
		 return this;
	}
	public Disciplina gerarSituacao() {
        this.situacao = (this.media>=7)?"aprovado":"reprovado";
        return this;
	}
	
	public static void main(String[] args) {
		
		Aluno a = 
       new Aluno(10,"lu","lu@gmail.com",TypeCurso.TECNICO);
		//1 aluno
		//2 disciplinas adicionadas no Aluno
		Disciplina d1 =new Disciplina(20,"java",7.,9.);
		           d1.gerarMedia();
		           d1.gerarSituacao();
	      a.adicionar(d1);
	      
	      
	     a.adicionar(new Disciplina(21,"angular",8.,10.)
	    		 .gerarMedia().gerarSituacao() ); 
	
	   System.out.println(a);
	   System.out.println(a.getDisciplinas());
	     
	     
	     
	     
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
