package entity;

public class Filtro {

	private String sucursal;
	private String item;
	private String ramo;
	private String numeroApolice;

	public Filtro() {
	}

	public Filtro(String sucursal, String item, String ramo, String numeroApolice) {

		this.sucursal = sucursal;
		this.item = item;
		this.ramo = ramo;
		this.numeroApolice = numeroApolice;
	}

	@Override
	public String toString() {
		return "Filtro " + ", sucursal=" + sucursal + ", item=" + item + ", ramo=" + ramo + ", numeroApolice="
				+ numeroApolice + "]";
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

}
