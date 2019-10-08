package model;


public class Usuario {

	private Integer idUsuario;
	private String primeiroNome;
	private String ultimoNome;
	private String email;
	private String cpf;
	private String sexo;
	private String numero;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String primeiroNome, String ultimoNome, String email, String cpf, String sexo,
			String numero) {
		super();
		this.idUsuario = idUsuario;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.cpf = cpf;
		this.sexo = sexo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome
				+ ", email=" + email + ", cpf=" + cpf + ", sexo=" + sexo + ", numero=" + numero + "\n";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}



}
