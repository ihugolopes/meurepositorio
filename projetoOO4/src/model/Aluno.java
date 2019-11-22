package model;

import java.io.Serializable;
import java.util.Arrays;

public class Aluno implements Serializable {

	// atributos
	// construtor vazio
	// construtor cheio
	// to string
	// getters e setters

	private Long id;
	private String nome;
	private Integer idade; // representacao ...
	private String disciplinas[]; // vetor [0]....
	private Double notas[]; // vetor

	// encapsulamento
	// encapsular por construtor

	// construtor vazio e cheio

	// Melhor prática e desenho de classe ..
	public Aluno() {
	}

	public Aluno(Long id, String nome, Integer idade, String[] disciplinas, Double[] notas) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", idade=" + idade + ", disciplinas="
				+ Arrays.toString(disciplinas) + ", notas=" + Arrays.toString(notas) + "]";
	}

	// sobrecarga metodo...
	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(Aluno a) {
		System.out.println(a);
	}

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
	// ao inves do vetor [] utiliza varargs ...

	public void setDisciplinas(String... disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double... notas) {
		this.notas = notas;
	}

	public static void main(String[] args) {

		Aluno a = new Aluno();
		a.setId(100L).setNome("ricardo").setIdade(20);
		// vetor
		// a.setDisciplinas(new String[] {"java","ionic","angular"});
		a.setDisciplinas("java", "angular");

		int pos = 0;
		for (String s : a.getDisciplinas()) {
			System.out.println(s + ", pos=" + pos++);
		}

		for (int i = 0; i < a.getDisciplinas().length; i++) {
			System.out.println(a.getDisciplinas()[i] + ",pos=" + i);
		}

		String curso = "angular,java,node";
		String dados[] = curso.split(",");

		for (int i = 0; i < curso.length(); i++) {
			System.out.println(curso.substring(i, i + 1));
		}
		// retirar o ln ( imprimindo em colunas)

		for (String x : dados) {
			System.out.println(x);
		}

		// Duvidas ?
		// se aprofundar em ..
		// Token , Varargs, foreach ... Treinar ...

	}

}
