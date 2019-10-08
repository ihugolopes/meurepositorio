package entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno  implements Serializable{

  	private static final long serialVersionUID = 1L;
	 private Integer id;
	 private String  nome;
	 private Double nota1;
	 private Double nota2;
	 private String disciplina;
     private Double media;
     private String situacao;
     
     
      public Aluno() {
	}

	

	public Aluno(Integer id, String nome, String disciplina, Double nota1, 
			           Double nota2) {
		this.id= id;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.disciplina = disciplina;
	}
 


 

	@Override
	public String toString() {
		return "Aluno [id=" + id+ ", nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", disciplina=" + disciplina + ", media=" + media +
				", situacao=" + situacao + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setIdAluno(Integer id) {
		this.id= id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	 
	 //Builder	
	 public  Aluno gerarMedia() {
		   this.media = (this.nota1 + this.nota2)/2;
		 return this;
	 }
	
	 //Builder
	 public  Aluno gerarSituacao() {
		   this.situacao = (this.getMedia() >=7)?"Aprovado":"Reprovado";
		 return this;
	 }



	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	
	
 
	 
	 
	

}
