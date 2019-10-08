package entity;

public class Telefone {
	
	  private Integer idTelefone;
	  private String numero;
	  private String tipo;
	  //Telefone hasOne
	  //Tem UmCliente
	  //ManyToOne
      private Cliente cliente;
	
	public Telefone() {

	}

	public Telefone(Integer idTelefone, String numero, String tipo) {
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
