package teoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente implements Comparable<Cliente> {

	private Integer codigo;
	private String nome;

	public Cliente() {
	}

	public Cliente(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + "]";
	}

	@Override
	public int compareTo(Cliente c) {
		return this.nome.compareTo(c.getNome());
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Cliente xx = new Cliente(10, "joao");
		Cliente hh = new Cliente(20, "joao");
		
		System.out.println("Verificando se são iguais: ");
		System.out.print(xx.getNome() + " e " + hh.getNome() + " são iguais? ");
		System.out.println(xx.getNome().equals(hh.getNome()));
		System.out.println("----------------------------------");
		System.out.println("Lista ordenada com sort: ");
		Cliente c = new Cliente(10, "ada");
		Cliente x = new Cliente(12, "juvenal");
		Cliente t = new Cliente(11, "carlos");
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(c);
		lista.add(x);
		lista.add(t);
		Collections.sort(lista);
		System.out.println(lista);
	}

}
