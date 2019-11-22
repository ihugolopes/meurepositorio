package model;

public class Curso {

	private Long id;
	private String descricao;

	public Curso() {
	}

	public Curso(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", descricao=" + descricao + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
