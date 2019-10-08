package model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente implements Serializable {

	// Preparacao da Classe para virar um Rest ...

	private static final long serialVersionUID = 7L;
	@XmlElement
	private Long id;
	@XmlElement
	private String nome;
	@XmlElement
	private String email;
	@XmlElement
	private String sexo;

	// alt + s (generate getters and setters)
	public Long getId() {
		return id;
	}

	// encapsula com ao inves do void (Classe)
	// return this
	// cascata ( Programacao no modo cascata) cascade
	// Builder ...

	// método para proteger ...
	public Cliente setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Cliente setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getSexo() {
		return sexo;
	}

	public Cliente setSexo(String sexo) {
		this.sexo = sexo;
		return this;
	}

	// main ctrl + espaço e enter
	public static void main(String[] args) {
		// classe objeto = new Construtor()
		// new (espaço de mem) Construtor ...

		// c nada mais é que a execuçao da classe cliente
		// Classe objeto espaçodemem Construtor...
		Cliente c = new Cliente();

		// c.setNome("ju");
		// c.setEmail("ju@gmail.com");

		c.setNome("jose").setEmail("jose@gmail.com").setId(1000l).setSexo("m");

		// imprimindo o nome
		System.out.println(c.getNome() + "\n" + c.getEmail());
		// syso + ctrl + espaço
		// sysout (imprimir) JSE
		// \t (lado) tab
		// \n Abaixo
		// selecionei tudo (ctrl + shift + c)
		// comentario
		// cafe

	}

}
