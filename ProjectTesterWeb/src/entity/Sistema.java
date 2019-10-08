package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import error.ExceptionDao;
import error.GsonException;
import gson.GsonMarcas;
import persistence.CarroDao;
import persistence.EnderecoDao;
import persistence.ProprietarioDao;

public class Sistema implements Serializable {

	private static final long serialVersionUID = 1L;
	static int op, resp, propri, marcha;
	static Integer vm, vc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Endereco e = new Endereco();
		Proprietario p = new Proprietario();
		Marca m = new Marca();
		Carro c = new Carro();
		String data = null;
		int r, re;
		ArrayList<Marca> list = new ArrayList<Marca>();
		ArrayList<Marca> mark = new ArrayList<Marca>();

		System.out.println("Bem-Vindo ao sistema de teste de performance ve�cular da CAR X!");
		System.out.println("");

		try {

			System.out.println("Deseja fazer uma nova opera��o de teste?");
			System.out.println("1) Sim");
			System.out.println("2) N�o");
			resp = sc.nextInt();
			sc.nextLine();

			if (resp == 1) {

				// ======================DADOS DO PROPRIET�RIO===============
				System.out.println("=====================================");
				System.out.println("Bem vindo ao cadastro de propriet�rio!");
				System.out.println("=====================================");
				System.out.println("");
				System.out.println("Por favor, entre com os dados do propriet�rio do ve�culo: ");
				System.out.println("");
				System.out.println("Digite o nome: ");
				String nome = sc.nextLine();
				System.out.println("Digite o RG (9 d�gitos): ");
				String rg = sc.nextLine();
				p.autenticaGenerico(rg, 9);
				System.out.println("Digite o CPF (11 d�gitos): ");
				String cpf = sc.nextLine();
				p.autenticaGenerico(cpf, 11);
				System.out.println("Digite a data de nascimento (Ex: 01/01/2019): ");
				data = sc.nextLine();

				System.out.println("");
				System.out.println("==============================");
				System.out.println("====Entre com o Endere�o:=====");
				System.out.println("==============================");
				System.out.println("");
				System.out.println("Digite a rua: ");
				String rua = sc.nextLine();
				System.out.println("Digite o bairro: ");
				String bairro = sc.nextLine();
				System.out.println("Digite a cidade: ");
				String cidade = sc.nextLine();
				System.out.println("Digite o estado: ");
				String estado = sc.nextLine();
				System.out.println("Digite o Complemento: ");
				String complemento = sc.nextLine();
				System.out.println("Digite o CEP: ");
				String cep = sc.nextLine();

				try {
					e = new Endereco(rua, bairro, cidade, estado, cep, complemento);
					p = new Proprietario(nome, cpf, rg, data, e);
				} catch (Exception ex) {
					System.out.println("Erro ao gravar!");
				}
				// ======================DADOS DO VE�CULO===============
				System.out.println("");
				System.out.println("========================================");
				System.out.println("=====Entre com os dados do ve�culo!=====");
				System.out.println("========================================");
				System.out.println("");
				System.out.println("Entre com a marca");
				String marca = sc.nextLine();
				System.out.println("Entre com o modelo: ");
				String modelo = sc.nextLine();
				System.out.println("Entre com a cor: ");
				String cor = sc.nextLine();
				System.out.println("Entre com o ano (ex: 2010): ");
				Integer ano = sc.nextInt();
				sc.nextLine();

				System.out.println("Entre com o n� do chassi");
				String chassi = sc.nextLine();

				System.out.println("Entre com a velocidade m�xima: ");
				vm = sc.nextInt();
				sc.nextLine();
				System.out.println("Entre com o n�mero de portas: ");
				Integer np = sc.nextInt();
				sc.nextLine();

				System.out.println("Entre com o n�mero de marchas: ");
				Integer nm = sc.nextInt();
				sc.nextLine();

				System.out.println("Entre com o volume de combust�vel: ");
				vc = sc.nextInt();
				sc.nextLine();

				System.out.println("Informe se tem teto solar: ");
				System.out.println("1) Sim");
				System.out.println("2) N�o");
				Integer ts = sc.nextInt();
				sc.nextLine();
				if (ts == 1) {
					c.tetoSolar(true);

				} else if (ts == 2) {
					c.tetoSolar(true);
				} else {
					System.out.println("Valor inv�lido!");
				}

				System.out.println("Informe se c�mbio autom�tico: ");
				System.out.println("1) Sim");
				System.out.println("2) N�o");
				Integer ca = sc.nextInt();
				sc.nextLine();
				if (ca == 1) {
					c.setCambioautomatico(true);
				} else if (ts == 2) {
					c.setCambioautomatico(false);
				} else {
					System.out.println("Valor v�lido!");
				}

				Proprietario pro = new Proprietario();

				try {
					m = new Marca(marca, modelo, cor, ano, chassi);

					c = new Carro(vm, c.isTetosolar(), nm, c.isCambioautomatico(), vc, np, pro, m);

					list.add(m);
				} catch (Exception ex) {
					System.out.println("Erro ao gravar!");
				}

				// =====TESTE DE PERFORMANCE===========
				System.out.println("===============================================");
				System.out.println("====Deseja iniciar o teste de performance?=====");
				System.out.println("===============================================");
				System.out.println("1) Sim");
				System.out.println("2) N�o");
				re = sc.nextInt();
				sc.nextLine();

				if (re == 1) {

					System.out.print("Velocidade m�xima do ve�culo: ");
					System.out.println(c.getVelocidadeMax());

					System.out.print("Velocidade atual de ve�culo: ");
					System.out.println(c.getVelocidadeAtual());
					System.out.println("");

					// ==========TESTE ACELERACAO NA VIA==============
					System.out.println("Deseja iniciar o teste de capacidade de acelera��o na via?");
					System.out.println("1) Sim");
					System.out.println("2) N�o");
					Integer t = sc.nextInt();
					sc.nextLine();
					System.out.println("");

					c.acelera(t);

					// ==========Troca de marcha=============
					System.out.println("");
					System.out.println("Deseja iniciar o teste de troca de marcha?");
					System.out.println("1) Sim");
					System.out.println("2) N�o");
					Integer tm = sc.nextInt();
					sc.nextLine();
					if (tm == 1) {
						System.out.println("Digite para qual marchar deseja trocar: ");
						marcha = sc.nextInt();
						sc.nextLine();
						c.trocaM(marcha);
					}

					// ===========REDUCAO DE MARCHAS========
					System.out.println("");
					System.out.println("Deseja iniciar o teste de redu��o de marchas?");
					System.out.println("1) Sim");
					System.out.println("2) N�o");
					Integer rms = sc.nextInt();
					sc.nextLine();
					if (rms == 1) {
						System.out.println("Teste redu��o de marchas: ");
						System.out.println();
						for (r = marcha; r > 0; r--)
							System.out.println("Reduzido para a " + r + "� Marcha com sucesso.");
					}
					System.out.println("Teste conclu�do com sucesso!");
					System.out.println("");
				}

				// ====TESTE DE FRENAGEM================
				System.out.println("Deseja iniciar o teste de frenagem?");
				System.out.println("1) Sim");
				System.out.println("2) N�o");
				Integer tf = sc.nextInt();
				sc.nextLine();
				if (tf == 1) {
					c.freiar(true);
				}

				// ====TESTE DE R�================
				System.out.println("");
				System.out.println("Deseja iniciar o teste de r�?");
				System.out.println("1) Sim");
				System.out.println("2) N�o");
				Integer ree = sc.nextInt();
				sc.nextLine();
				if (ree == 1) {
					if (c.getVelocidadeAtual() > 0) {
						System.out.println("R� proibida, velocidade acima do permitido");
						System.out.println("Pare o ve�culo!");
					} else if (c.getVelocidadeAtual() == 0) {
						System.out.println("");
						System.out.println("R� engatada!");
						System.out.println("Teste conclu�do com sucesso!");

					}
				}

			} else if (resp == 2) {
				System.out.println("Opera��o finalizada!");
			} else {
				System.out.println("A opera��o inserida � inv�lida!");
				System.out.println("Opera��o finalizada!");
			}

			System.out.println("");
			System.out.println("Finalizar teste:");
			System.out.println("1) Sim");
			System.out.println("2) Cancelar");
			Integer test = sc.nextInt();
			sc.nextLine();
			if (test == 1) {

				// ===DADOS DO PROPRIETARIO===
				System.out.println("=============================");
				System.out.println("====DADOS DO PROPRIET�RIO====");
				System.out.println("=============================");
				System.out.println("");
				System.out.println(p);

				// ===DADOS DO VE�CULO===
				System.out.println("=============================");
				System.out.println("======DADOS DO VE�CULO======= ");
				System.out.println("=============================");
				System.out.println("");
				System.out.println(m);
				System.out.println(c);
				System.out.println(c.tanque(vc));

				// ===DADOS DO TESTE DE PERFORMANCE
				System.out.println("");
				System.out.println("====================================");
				System.out.println("===ESTADO DO TESTE DE PERFORMANCE=== ");
				System.out.println("====================================");
				System.out.println("");
				System.out.println("TESTE CONCLU�DO COM SUCESSO COM: " + list + "");

				// ====DAO's====
				try {
					ProprietarioDao pdao = new ProprietarioDao();
					pdao.create(p);

					CarroDao cdao = new CarroDao();
					cdao.create(c, m);

					EnderecoDao edao = new EnderecoDao();
					edao.create(e);
				} catch (ExceptionDao ex) {
					new ExceptionDao(1);
				}
				// ===GERANDO GSON====
				try {
					GsonMarcas gson = new GsonMarcas();
					mark.add(m);
					gson.open();
					gson.create(mark);
					gson.close();
				} catch (GsonException ex) {
					new GsonException().getMessage();
				}
			} else {
				System.out.println("Teste Cancelado!!!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		sc.close();

	}

}
