package model;

public class Pessoa {

	private String nome;
	private Pessoa conjuge;

	public Pessoa() {
	}

	public Pessoa(String nome, Pessoa conjuge) {
		this.nome = nome;
		this.conjuge = conjuge;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", conjuge=" + conjuge.getNome() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getConjuge() {
		return conjuge;
	}

	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", null);
		Pessoa p2 = new Pessoa("João", p);
		p.setConjuge(p2);
		System.out.println(p);
		System.out.println(p2);
	}

}
