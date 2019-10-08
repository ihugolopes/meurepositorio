package control;

import utils.Numero;

public class MainCalulo {

	public static void main(String[] args) {
		Numero n = new Numero();
		n.setNumero1(10d);
		n.setNumero2(0d);
		CalculoMatematico cm = new CalculoMatematico();

		n.setResposta("valor divisao:" + cm.divisao(n.getNumero1(), n.getNumero2()));

		System.out.println(n.getResposta());

		// Aluno a = new Aluno();
		// encapsulmaneto = (defesa) protecao dos atrubutos
		// calc = Math.abs(100.00 + 50/2 ...);
		// a.nome="pog";

	}

}
