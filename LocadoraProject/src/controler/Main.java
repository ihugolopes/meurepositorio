package controler;

import java.util.Scanner;

import entity.Aluguel;
import entity.Cliente;
import entity.Filme;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void opcoes() {
		System.out.println("Qual opera��o deseja realizar?");
		System.out.println();
		System.out.println("1) Cadastrar");
		System.out.println("2) Excluir");
		System.out.println("3) Alterar");
		System.out.println("4) Pesquisar");	
	}
	
	public static void main(String[] args) throws Exception {

		Cliente c = new Cliente();
		Aluguel a = new Aluguel();
		Filme f = new Filme();
		
		System.out.println("Bem-vindo a Teste Locadora!");
		System.out.println("");
		System.out.println("|||Menu|||");
		System.out.println("> Informe a op��o desejada: \n");
		
		
		System.out.println("1) Clientes");
		System.out.println("2) Filmes");
		System.out.println("3) Alugu�is");
		
		int resp = sc.nextInt();
		int resp2;
		
		if(resp == 1) {
			opcoes(); //Chamando m�todo padr�o para op��es
			resp2 = sc.nextInt(); //Recebendo op��o
			
			switch(resp2) { //Usando switch case para escolher a op��o
			
			case 1:
	            c.cadastrar();
	            break;
	        case 2:
	           c.excluir();
	            break;
	        case 3:	        	
	            c.alterar();
	            break;
	        case 4:
	        	System.out.println("Escolha o modo de busca: ");
	        	System.out.println("1) Por id");
	        	System.out.println("2) Buscar todos");
	        	int busca = sc.nextInt();
	        	
	        	if(busca == 1) {
	        	c.buscarPorId();
	        	} else if (busca == 2) {
	            c.buscar();
	        	} else {
	        	System.out.println("Valor inv�lido, opera��o terminada.");
	        	}
	            break;
				
			}
			
		} else if (resp == 2) {	
			opcoes();
			resp2 = sc.nextInt();
			
			switch(resp2) {
			
			case 1:
	            f.cadastrar();
	            break;
	        case 2:
	        	f.excluir();
	            break;
	        case 3:
	            f.alterar();
	            break;
	        case 4:
	        	System.out.println("Escolha o modo de busca: ");
	        	System.out.println("1) Por id");
	        	System.out.println("2) Buscar todos");
	        	int busca = sc.nextInt();
	        	
	        	if(busca == 1) {
	        	f.buscarPorId();
	        	} else if (busca == 2) {
	            f.buscar();
	        	} else {
	        	System.out.println("Valor inv�lido, opera��o terminada.");
	        	}
	            break;
				
			}
		} else if (resp == 3) {
			opcoes();
			resp2 = sc.nextInt();
			
			switch(resp2) {
			
			case 1:
	            a.cadastrar();
	            break;
	        case 2:
	        	a.excluir();
	            break;
	        case 3:
	            a.alterar();
	            break;
	        case 4:
	        	System.out.println("Escolha o modo de busca: ");
	        	System.out.println("1) Por id");
	        	System.out.println("2) Buscar todos");
	        	int busca = sc.nextInt();
	        	
	        	if(busca == 1) {
	        	a.buscarPorId();
	        	} else if (busca == 2) {
	            a.buscar();
	        	} else {
	        	System.out.println("Valor inv�lido, opera��o terminada.");
	        	}
	            break;
				
			}
		} 
	
		 System.out.println("Fim do teste.");
	}
	
}
