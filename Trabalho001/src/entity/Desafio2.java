package entity;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matricula, n1, n2, n3, nfinal, media = 0, maior = 0, menor = 0, repFreq = 0, rep = 0, totalRep = 0;
		Integer frequencia = null, mediaTurma;
		String resultado, perRepFre;

		for (int i = 0; i < 10; i++) {
			System.out.print("Informe a matrícula do aluno: ");
			matricula = sc.nextInt();
			sc.nextLine();

			System.out.print("Informe a primeira nota do aluno: ");
			n1 = sc.nextInt();
			sc.nextLine();

			System.out.print("Informe a segunda nota do aluno: ");
			n2 = sc.nextInt();
			sc.nextLine();

			System.out.print("Informe a terceira nota do aluno: ");
			n3 = sc.nextInt();
			sc.nextLine();

			System.out.print("Informe a frequencia do aluno: ");
			frequencia = sc.nextInt();
			sc.hasNextLine();

			// ----------------------------------------------------------------------
			System.out.println("");
			System.out.println("DADOS DO ALUNO: ");
			System.out.println("Número de matrícula: " + matricula);
			System.out.println("Frequência: " + frequencia);

			// NOTA FINAL
			nfinal = (n1 + n2 + n3) / 3;
			System.out.print("Nota Final: " + nfinal);
			System.out.println("");

			// RESULTADO
			resultado = (nfinal >= 6 && frequencia >= 40) ? (String) "Aprovado" : "Reprovado";
			if (resultado == "Reprovado") {
				rep++;
			}
			System.out.println("RESULTADO: " + resultado);
			System.out.println("");

			// MEDIA DA TURMA
			media = media + nfinal;

			// RETORNA MAIOR E MENOR NOTA
			if (nfinal < menor || menor == 0) {
				menor = nfinal;
			}
			if (nfinal > maior) {
				maior = nfinal;
			}

			// REPROVADOS POR FALTAS
			if (frequencia < 40) {
				repFreq++;
			}
		}

		System.out.println(" ");
		System.out.println("TABELA DE DADOS GERAIS: ");
		System.out.println("Maior nota da turma: " + maior);
		System.out.println("Menor nota da turma: " + menor);
		System.out.println("Nota média da turma: " + media / 10);
		System.out.println("Total de alunos reprovados: " + rep);
		System.out.println("Total de alunos reprovados por frequência: " + repFreq);
		System.out.println("Porcentagem de alunos reprovados por infrequência:" + ((float) repFreq * 100 / 10) + "%");

		sc.close();
	}

}
