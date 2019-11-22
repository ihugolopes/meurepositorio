package entity;

public class Aluno {

	private Long idAluno;
	private String nome;
	private String email;
	private String senha;
	
	private Disciplina disciplina;

	public Aluno() {
	}

	public Aluno(Long idAluno, String nome, String email, String senha) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Aluno(Long idAluno, String nome, String email, String senha, Disciplina disciplina) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno: idAluno = " + idAluno + "\n" + ", nome = " + nome + "\n" + ", email = " + email + "\n" + ", senha = " + senha ;
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
