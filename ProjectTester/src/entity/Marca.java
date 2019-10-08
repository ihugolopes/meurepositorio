package entity;

public class Marca {
	private String nomeDaMarca;
	private String modelo;
	private String cor;
	private Integer ano;
	private String chassi;

	public Marca() {
	}

	public Marca(String nomeDaMarca, String modelo, String cor, Integer ano, String chassi) {
		this.nomeDaMarca = nomeDaMarca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.chassi = chassi;
	}

	@Override
	public String toString() {
		return "Marca: " + nomeDaMarca + ", Modelo:" + modelo + ", Cor: " + cor + ", Ano: " + ano + ", Chassi: "
				+ chassi;
	}

	public String getNomeDaMarca() {
		return nomeDaMarca;
	}

	public void setNomeDaMarca(String nomeDaMarca) {
		this.nomeDaMarca = nomeDaMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
}