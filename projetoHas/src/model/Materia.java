package model;

public class Materia {
	// rel 1 p 1

	// relacionou a Materia já busca o aluno
	private Integer codigoMateria;
	private String nomeMateria;
	private Aluno aluno;

	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public static void main(String[] args) {
		// Enteder 10 x 0 --Placar

		Aluno a = new Aluno(); // objeto
		a.setIdAluno(100);
		a.setNome("luciana"); // solto
		Materia m = new Materia();
		m.setCodigoMateria(2000);
		m.setNomeMateria("java");
		// preso
		// grimprei...
		m.setAluno(a); // RELACIONAMENTO
		// impime via materia
		// codigo da Materia, codigo do aluno,
		// nome, nomeMateria
		// 2000
		System.out.println("cod materia:" + m.getCodigoMateria());
		System.out.println("Nome:" + m.getNomeMateria());
		System.out.println("aluno Id:" + m.getAluno().getIdAluno());
		System.out.println("aluno Nome:" + m.getAluno().getNome());

	}

}
