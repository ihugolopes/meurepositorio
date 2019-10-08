package entity;

import java.util.Date;

public class Cliente extends Pessoa {
	//Cliente é uma Pessoa
	//Cliente 
	private String sexo;
	private Date dataNascimento;
	
	public Cliente() {
	}

	//Via Construtor estou Unindo Pessoa e Cliente
	public Cliente(Integer id, String nome, String email, String sexo, Date dataNascimento) {
		super(id, nome, email); //sobe Pessoa
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}



	@Override
	public String toString() {
		return "Cliente [sexo=" + sexo + ", dataNascimento=" + dataNascimento + "]";
	}
	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	

}
