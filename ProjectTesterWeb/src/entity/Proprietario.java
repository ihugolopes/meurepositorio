package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proprietario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idProprietario;
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private Endereco endereco;
//	public static LocalDateTime dataCadastro = LocalDateTime.now();

	private List<Proprietario> cadastrosP;

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

	
	public Proprietario(Integer idProprietario, String nome, String email, String cpf, String rg,
			String dataNascimento) {
		super();
		this.idProprietario = idProprietario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Proprietario: " + "Nome: " + nome + ", CPF: " + cpf + ", RG: " + rg + ", Data de Nascimento: "
				+ dataNascimento + "\n" + ", Endereco: " + endereco;
	}

	public Integer getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void setCpf(String string) {
		this.cpf = string;
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

	public List<Proprietario> getCadastrosP() {
		return cadastrosP;
	}

	public void setCadastrosP(List<Proprietario> cadastrosP) {
		this.cadastrosP = cadastrosP;
	}

	public Boolean isNome() {
		Pattern p = Pattern.compile("[a-z A-Z Ã-Ç àü]{2,50}");
		Matcher m = p.matcher(this.nome);
		return m.matches();
	}
//REGEX
//	public Boolean isRg() {
//		Pattern p = Pattern.compile("[0-9]{3,20}");
//		Matcher m = p.matcher(this.rg);
//		return m.matches();
//	}
//
//	public Boolean isCpf() {
//		Pattern p = Pattern.compile("[0-9]{11}");
//		Matcher m = p.matcher(this.cpf);
//		return m.matches();
//	}

	public void autenticaGenerico(String i, Integer a) throws Exception {
		if (i.length() != a) {
			throw new Exception ("Informe " + a + " números ");
		}
	}

	public void adicionar(Proprietario m) {
		if (this.cadastrosP == null) {
			this.cadastrosP = new ArrayList<Proprietario>();
		}
		this.cadastrosP.add(m);
	}

	public void adicionar(Proprietario... m) {
		if (this.cadastrosP == null) {
			this.cadastrosP = new ArrayList<Proprietario>();
		}
		this.cadastrosP.addAll(Arrays.asList(m));
	}

	public static void main(String[] args) {
		System.out.println("É UMA LETRA?");
		char letra = 'A';
		System.out.println(Character.isAlphabetic(letra));
		System.out.println("É UM NÚMERO?");
		char numero = '1';
		System.out.println(Character.isDigit(numero));
		System.out.println("------------------------------------------------------------------");
		Proprietario p = new Proprietario(null, "Hugo", "hugo@gmail.com", "3435345", "563654", "27/03/2019");

		System.out.println("É UM NOME?");
		System.out.println(p.isNome());
//		System.out.println("É UMA RG?");
//		System.out.println(p.isRg());
//		System.out.println("É UMA CPF?");
//		System.out.println(p.isCpf());
//		System.out.println("------------------------------------------------------------------");
//		System.out.println("É ESTÁ VAZIO?");
//		System.out.println(p.getCpf().isEmpty());
	}


}
