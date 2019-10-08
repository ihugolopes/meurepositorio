package entity;

public class Proprietario {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private Endereco endereco;

	public Proprietario() {
		super();
	}

	public Proprietario(String nome, String cpf, String rg, String dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Proprietario: " + "Nome: " + nome + ", CPF: " + cpf + ", RG: " + rg + ", Data de Nascimento: " + 
				dataNascimento
				+ "\n" + ", Endereco: " + endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
