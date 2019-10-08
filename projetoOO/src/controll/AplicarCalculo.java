package controll;

public class AplicarCalculo {

	public static CalculosBasicos soma = (a, b) -> a + b;
	public static CalculosBasicos subtracao = (a, b) -> a - b;
	public static CalculosBasicos divisao = (a, b) -> a / b;
	public static CalculosBasicos multiplicao = (a, b) -> a * b;
	public static CalculosBasicos maior = (a, b) -> Math.max(a, b);
	public static CalculosBasicos exponenciacao = (a, b) -> Math.pow(a, b);

	public static void main(String[] args) {

		System.out.println(AplicarCalculo.soma.operacao(100., 200.));
		System.out.println(AplicarCalculo.subtracao.operacao(20., 10.));
		System.out.println(AplicarCalculo.maior.operacao(20., 40.));
		System.out.println(AplicarCalculo.divisao.operacao(20., 2.));
		System.out.println(AplicarCalculo.exponenciacao.operacao(2., 10.));
	}
}
