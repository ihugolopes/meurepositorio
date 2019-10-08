package entity;

import java.io.Serializable;

public class Endereco  implements
Serializable {

	private static final long serialVersionUID = 1L;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;

	public Endereco() {
	}

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}


	@Override
	public String toString() {
		return "\n" + "\n" + "Rua: " + rua + "\n" + ", Bairro: " + bairro + "\n" + ", Cidade: " + cidade + "\n" + ", Estado:" + estado + "\n" + ", Cep: "
				+ cep + "\n" + ", Complemento: " + complemento + "\n";
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
