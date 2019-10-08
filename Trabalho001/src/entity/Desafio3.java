package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Desafio3 {

	int matricula;
	Double notaProvisoria = 0.0;
	static Date data;
	String d;
	double v1;
	double v2;
	double somar;
	double media;

	@Override
	public String toString() {
		return "Matricula: " + matricula + ", Nota Provisória: " + notaProvisoria + ", Data: "
				+ new SimpleDateFormat("dd/MM/yyyy").format(data) + "\n";
	}

	private double equacao(double[] notaProvisoria) {
		this.v1 = 0;
		this.v2 = 0;
		for (int i = 0; i < notaProvisoria.length; i++) {
			v1 += Math.pow(notaProvisoria[i], 2);
			v2 += notaProvisoria[i];
		}

		double ds = (v1 - (Math.pow(v2, 2) / notaProvisoria.length)) / (notaProvisoria.length - 1);
		return Math.sqrt(ds);
	}

	public void cNotaFinal() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date d1 = sdf.parse("20/04/2019");
			Date d2 = sdf.parse("02/05/2019");
			Date d3 = sdf.parse("30/05/2019");
			Date d4 = sdf.parse("30/06/2019");

			if (this.data.before(d1) || this.data.equals(d1)) {
				this.notaProvisoria += 10.0;
			} else if (this.data.after(d1) && (this.data.before(d2) || (this.data.equals(d2)))) {
				this.notaProvisoria = this.notaProvisoria;
			} else if (this.data.after(d2) && (this.data.before(d3) || (this.data.equals(d3)))) {
				this.notaProvisoria /= 2;
			} else {
				this.notaProvisoria = 0.0;
			}

		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	private double m(double[] notas) {
		somar = 0;

		for (int i = 0; i < notas.length; i++) {
			somar += notas[i];
		}

		return somar / notas.length;
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Desafio3 des = new Desafio3();
		double notas[] = new double[10];
		double notasFinais[] = new double[10];

		ArrayList<Desafio3> list = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			list.add(new Desafio3());

			System.out.print("Entre com o número de aluno: ");
			list.get(i).matricula = sc.nextInt();

			System.out.print("Entre com a nota: ");
			list.get(i).notaProvisoria = sc.nextDouble();
			notas[i] = list.get(i).notaProvisoria;
			sc.nextLine();

			System.out.print("Entre com a data de entrega: ");
			list.get(i).d = sc.nextLine();
			System.out.println("");
			list.get(i).data = sdf.parse(list.get(i).d);

			list.get(i).cNotaFinal();
			notasFinais[i] = list.get(i).notaProvisoria;

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Número do aluno: " + list.get(i).matricula);
			System.out.println("Nota final do aluno: " + list.get(i).notaProvisoria);
		}

		String g = new SimpleDateFormat("dd/MM/yyyy").format(data);
		System.out.println("Data: " + g);
		System.out.println("Média: " + des.m(notas));

		System.out.println("-----------------------------------");
		System.out.println(list);
	}
}