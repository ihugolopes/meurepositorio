package teoria;

import java.text.NumberFormat;

public class Funcionario {

	static NumberFormat nf = NumberFormat.getInstance();
	private String nome;
	private Double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void formatacao(int a) {
		nf.setMaximumFractionDigits(2);
		nf.setMinimumIntegerDigits(2);
		System.out.println(nome + ", " + nf.format(salario));
	}
}

class Estagiario extends Funcionario {
	
	public void formatacao(int b) {
		System.out.println("Estagiário: \n" 
	+ "Nome: " + getNome() + "\nSalário: " + getSalario());
	}

}
