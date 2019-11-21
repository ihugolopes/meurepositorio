package entity;

public class Produto {

	private int tipo;
	private String nome;

	public Produto() {
	}

	public Produto(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [tipo=" + tipo + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
