package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// J8
	public static List<Aluno> alunos = new ArrayList<Aluno>();

	static {
		// this nem super nao pode ...
		// Alocado na execucao ....
		alunos.add(new Aluno(2, "jacob", "jacob@gmail.com"));
		alunos.add(new Aluno(3, "zau", "zau@gmail.com"));
		alunos.add(new Aluno(1, "davi", "davi@gmail.com"));
	}

	private Integer id;
	private String nome;
	private String email;

	public Aluno() {

	}

	public Aluno(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

	
	public static List<Aluno> getAlunos() {
		return alunos;
	}
	public static void setAlunos(List<Aluno> alunos) {
		Aluno.alunos = alunos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

	
	// J8
	public void ordenar() {
		Comparator<Aluno> comp = new Comparator<Aluno>() {
			@Override
			public int compare(Aluno a1, Aluno a2) {
				// depois antes, decrescente
				return a1.getId().compareTo(a2.getId());
			}
		};
		alunos.sort(comp);
	}
	// alunos é a lista
	// sort(Ordenar)
	// comp(regra ...)

	
	public static void main(String[] args) {

		Aluno a = new Aluno();
		a.ordenar();
		// J8
		a.getAlunos().stream().forEach(System.out::println);
	}
}
