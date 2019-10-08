package model;

import java.io.Serializable;

public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idEndereco;
	private String logradourdo;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	// Unidirecional Endererco busca cliente
	// relacionar ...

	private Cliente cliente;

	public void buscaCliente(Cliente c) {
		if (c.getIdCliente().equals(this.cliente.getIdCliente())) {
			System.out.println("ok");
		} else {
			System.out.println("nao ok");

		}
	}

	public Endereco() {

	}

	public Endereco(Integer idEndereco, String logradourdo, String bairro, String cidade, String estado, String cep) {
		this.idEndereco = idEndereco;
		this.logradourdo = logradourdo;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(Integer idEndereco, String logradourdo, String bairro, String cidade, String estado, String cep,
			Cliente cliente) {
		this.idEndereco = idEndereco;
		this.logradourdo = logradourdo;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradourdo=" + logradourdo + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", cliente=" + cliente + "]";
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradourdo() {
		return logradourdo;
	}

	public void setLogradourdo(String logradourdo) {
		this.logradourdo = logradourdo;
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

	public static void main(String[] args) {
		Cliente c = new Cliente(1001, "belem", "belem@gmail.com");
		Endereco e = new Endereco(100, "av rio branco", "centro", "rio de janeiro", "rj", "20040007");

		System.out.println(c);
		System.out.println(e);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/*
	 * select nome,id from cliente; rodrigues, 10
	 * 
	 * 
	 * select idCliente, nomeRua, bairro from endereco inner joi.. 10 , Av rio
	 * Branco, Centro
	 * 
	 * 
	 * 
	 */

}
