package entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// Como sua data irá aparecer ....
	static DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // J8
	// yyyy-MM-dd
	// SimpleDateFormat J7

	private Integer id;
	private String nome;
	private LocalDate dataCadastro; // J8
	private String email;
	// SimpleDateFormat J7
	private LocalDate dataNascimento;

	
	public Cliente() {
	}

	public Cliente(Integer id, String nome, LocalDate dataCadastro, String email, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", dataCadastro=" + FMT.format(dataCadastro) + ", email="
				+ email + ", dataNascimento=" + dataNascimento + "]";
	}

	
	public Integer retornaIdade() {
		Period periodo = Period.between(dataNascimento, LocalDate.now());
		return periodo.getYears();
	}


	// Nao Aceita Bate --> Struts ...
	// set e get e is
	// é Faz parte de um Bean (classe tradicional ...)
	public boolean isNome() {
		// regra
		Pattern p = Pattern.compile("[A-Z a-z]{2,50}");
		Matcher aplicar = p.matcher(nome);
		return aplicar.matches();
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public static void main(String[] args) {

		Cliente c = new Cliente(10, "belem", LocalDate.of(2018, 06, 20), "belem@gmail.com", LocalDate.of(1973, 01, 28));

		System.out.println(c);
		System.out.println(c.getNome() + "," + c.retornaIdade());
		// Formatacai yyyy-MM-dd
		System.out.println(Character.isDigit('8'));

	}

}
