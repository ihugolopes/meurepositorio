package teoria;

//CLASSE TRABALHANDO COM SOBRECARGA!

class Conceito0 {
	
	public static Double soma(String texto, Double n[]) {
		double resposta = 0;
		for (double x : n) {
			resposta += x;
		}
		System.out.println("Texto: " + texto);
		return resposta;
	}
}

public class Conceito1 extends Conceito0 {

	public static Double soma(Double n1, Double n2) {
		System.out.println("Sinalizador 1: ");
		return n1 + n2;
	}

	public static Double soma(Double... n) {
		double resp = 0;
		for (Double x : n) {
			resp += x;
		}
		System.out.println("Sinalizador 2: ");
		return resp;
	}

	public static void main(String[] args) {
		System.out.println("1 = " + soma(10., 20.));
		System.out.println("2 = " + soma(10., 20., 30., 40.));
		System.out.println("3 = " + soma("Sobrecarga: ", new Double[] { 1., 2., 3. }));
	}
}
