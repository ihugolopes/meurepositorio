package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String item;
	private String nomeSegurado;
	private String cpfCnpjSegurado;
	private String tipoDocumento;
	private Date dataEmissao;
	private String sucursal;
	private String placa;
	private String ramo;
	private String companhia;
	private String cpdCorretor;
	private String chassi;
	private String numeroApolice;
	private String numeroEndosso;
	private Integer idarquivo;
	private String nomeDoDocumento;

	public Cliente() {

	}

	public Cliente(String item, String nomeSegurado, String cpfCnpjSegurado, String tipoDocumento, Date dataEmissao,
			String sucursal, String placa, String ramo, String companhia, String cpdCorretor, String chassi,
			String numeroApolice, String numeroEndosso, Integer idarquivo) {
		super();
		this.item = item;
		this.nomeSegurado = nomeSegurado;
		this.cpfCnpjSegurado = cpfCnpjSegurado;
		this.tipoDocumento = tipoDocumento;
		this.dataEmissao = dataEmissao;
		this.sucursal = sucursal;
		this.placa = placa;
		this.ramo = ramo;
		this.companhia = companhia;
		this.cpdCorretor = cpdCorretor;
		this.chassi = chassi;
		this.numeroApolice = numeroApolice;
		this.numeroEndosso = numeroEndosso;
		this.idarquivo = idarquivo;
	}

	public Cliente(String item, String nomeSegurado, String cpfCnpjSegurado, String tipoDocumento, Date dataEmissao,
			String sucursal, String placa, String ramo, String companhia, String cpdCorretor, String chassi,
			String numeroApolice, String numeroEndosso, Integer idarquivo, String nomeDoDocumento) {
		super();
		this.item = item;
		this.nomeSegurado = nomeSegurado;
		this.cpfCnpjSegurado = cpfCnpjSegurado;
		this.tipoDocumento = tipoDocumento;
		this.dataEmissao = dataEmissao;
		this.sucursal = sucursal;
		this.placa = placa;
		this.ramo = ramo;
		this.companhia = companhia;
		this.cpdCorretor = cpdCorretor;
		this.chassi = chassi;
		this.numeroApolice = numeroApolice;
		this.numeroEndosso = numeroEndosso;
		this.idarquivo = idarquivo;
		this.setNomeDoDocumento(nomeDoDocumento);
	}
	


	public Cliente(String item, String sucursal, String ramo, String numeroApolice, String nomeDoDocumento) {
		super();
		this.item = item;
		this.sucursal = sucursal;
		this.ramo = ramo;
		this.numeroApolice = numeroApolice;
		this.nomeDoDocumento = nomeDoDocumento;
	}

	@Override
	public String toString() {
		return "Cliente: " + "\n" + "Item: " + item + "\n" + "nomeSegurado: " + nomeSegurado + "\n"
				+ "cpfCnpjSegurado: " + cpfCnpjSegurado + "\n" + "tipoDocumento: " + tipoDocumento + "\n"
				+ "dataEmissao: " + dataEmissao + "\n" + "sucursal: " + sucursal + "\n" + "placa: " + placa + "\n"
				+ "ramo: " + ramo + "\n" + "format: " + "\n" + "companhia: " + companhia + "\n" + "cpdCorretor: "
				+ cpdCorretor + "\n" + "chassi: " + chassi + "\n" + "numeroApolice: " + numeroApolice + "\n"
				+ "numeroEndosso: " + numeroEndosso;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getCpfCnpjSegurado() {
		return cpfCnpjSegurado;
	}

	public void setCpfCnpjSegurado(String cpfCnpjSegurado) {
		this.cpfCnpjSegurado = cpfCnpjSegurado;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getCpdCorretor() {
		return cpdCorretor;
	}

	public void setCpdCorretor(String cpdCorretor) {
		this.cpdCorretor = cpdCorretor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public String getNumeroEndosso() {
		return numeroEndosso;
	}

	public void setNumeroEndosso(String numeroEndosso) {
		this.numeroEndosso = numeroEndosso;
	}

	public Integer getIdarquivo() {
		return idarquivo;
	}

	public void setIdarquivo(Integer idarquivo) {
		this.idarquivo = idarquivo;
	}

	public String getNomeDoDocumento() {
		return nomeDoDocumento;
	}

	public void setNomeDoDocumento(String nomeDoDocumento) {
		this.nomeDoDocumento = nomeDoDocumento;
	}

}
