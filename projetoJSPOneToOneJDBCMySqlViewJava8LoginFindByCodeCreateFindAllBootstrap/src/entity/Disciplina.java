package entity;

public class Disciplina {

	private Long idDisciplina;
	private String nomeDisciplina;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;

	private Aluno aluno;

	public Disciplina() {
	}

	public Disciplina(Long idDisciplina, String nomeDisciplina, Double nota1, Double nota2, Aluno aluno) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	public Disciplina(Long idDisciplina, String nomeDisciplina, Double nota1, Double nota2) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Disciplina: idDisciplina = " + idDisciplina + "\n" + ", nomeDisciplina = " + nomeDisciplina + "\n" + ", nota1 = " + nota1
				+ "\n" + ", nota2 = " + nota2 + "\n" + ", media = " + media + "\n" + ", situacao = " + situacao + "\n" + ", aluno = " + aluno ;
	}

	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
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
		this.media = (this.nota1 + this.nota2) / 2;
		return this;
	}

	public Disciplina gerarSituacao() {
		if (this.media >= 7) {
			this.situacao = "aprovado";
		} else {
			this.situacao = "reprovado";
		}
		return this;
	}

	public static void main(String[] args) {

		Disciplina d = new Disciplina(10l, "java", 8., 7.).gerarMedia().gerarSituacao();

		Aluno a = new Aluno(20L, "Hugo", "hugo@gmail.com", "123");

		d.setAluno(a); //Passando aluno para a disciplina
		a.setDisciplina(d); //Passando disciplina para o aluno
		
		System.out.println("Listando disciplina com o aluno:");
		System.out.println("");
		System.out.println(d);
		System.out.println("-----------------------------------------");
		System.out.println("Listando aluno com a disciplina:");
		System.out.println("");
		System.out.println(a);
		
		System.out.println(a.getDisciplina());

	}

}
