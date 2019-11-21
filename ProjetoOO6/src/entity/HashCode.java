package entity;

import java.util.HashSet;
import java.util.Scanner;

public class HashCode {

	static HashSet<Object> produtos = new HashSet<>();

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String continua = "s";

			while (continua.equals("s")) {

				System.out.println("Bem-vindo ao Cadastro de Produtos");
				System.out.println("");
				System.out.println("Digite o tipo: ");
				int tipo = sc.nextInt();
				sc.nextLine();
			
				System.out.println("Entre com o nome: ");
				String nome = sc.nextLine();

				Produto produto = new Produto(tipo, nome);

				if (produtos.contains(produto)) {
					System.err.println("Tipo já existente!");
				} else {
					produtos.add(produto);
				}

				System.out.println("Deseja adicionar outro produto? (S/N)");

				continua = sc.nextLine();

			}

			produtos.forEach(System.out::println);

		}

	}

}
