package model;

public class AlunoCurso {
	
	private Aluno aluno;
	private Curso curso;

	public AlunoCurso() {
	}

	public AlunoCurso(Aluno aluno, Curso curso) {
		this.aluno = aluno;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return aluno + "," + curso;
	}

	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	public static void main(String[] args) {
		Aluno a1 = new Aluno(10L, "jose", "jose@gmail.com");
		Curso c1 = new Curso(100L, "java");
		// bem Basico mais tranquilo ...
		AlunoCurso relacional = new AlunoCurso(a1, c1);

		System.out.println(relacional);
	}
}
