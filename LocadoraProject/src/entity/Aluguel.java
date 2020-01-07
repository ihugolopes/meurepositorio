package entity;

import java.sql.Date;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import persistence.AluguelDaoImpl;
import persistence.ClienteDaoImpl;

public class Aluguel {

	private Integer idAluguel;
	private List<Filme> filmes;
	private Cliente cliente;
	private Date dataAluguel;
	private float valor;
	static Scanner sc = new Scanner(System.in);

	public Aluguel() {
	}

	public Aluguel(Integer idAluguel, List<Filme> filmes, Cliente cliente, Date dataAluguel, float valor) {
		this.idAluguel = idAluguel;
		this.filmes = filmes;
		this.cliente = cliente;
		this.dataAluguel = dataAluguel;
		this.valor = valor;
	}

	@Override
	public String toString() {
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);

		return "Id do Aluguel: " + idAluguel + "\nFilmes alugados: " + filmes + "\n" + cliente + "\nData do Aluguel: "
				+ dataAluguel + "\nValor: " + moeda.format(valor) + "\n";
	}

	public Integer getIdAluguel() {
		return idAluguel;
	}

	public Aluguel setIdAluguel(Integer idAluguel) {
		this.idAluguel = idAluguel;
		return this;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public Aluguel setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
		return this;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Aluguel setCliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	public Date getDataAluguel() {
		return dataAluguel;
	}

	public Aluguel setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
		return this;
	}

	public float getValor() {
		return valor;
	}

	public Aluguel setValor(float valor) {
		this.valor = valor;
		return this;
	}

	public List<Filme> alugarFilme() {
		List<Filme> listf = new ArrayList<Filme>();
		int resp;

		do {
			System.out.println("Digite o id do Filme a ser alugado: ");
			int fa = sc.nextInt();

			Filme f = new Filme().buscarPorIdp(fa);

			if (f == null) {
				System.out.println("Id do filme não existe, digite um id válido! \n");
			} else {
				System.out.println(f);
				listf.add(f);
			}

			System.out.println("Deseja selecionar outro filme? 1) Sim. 2) Não");
			resp = sc.nextInt();
			sc.nextLine();
		} while (resp == 1);

		return listf;
	}

	public Cliente bCliente(int c) throws Exception {
		Cliente cdi = new ClienteDaoImpl().find(c);

		if (cdi == null) {
			System.err.println("Cliente não encontrado! \n");
			System.out.println("Digite corretamento o ID do Cliente \n");
			bCliente(c);
		}

		return cdi;
	}

	public void cadastrar() throws Exception {
		List<Filme> listf = alugarFilme();

		System.out.println("Filmes Selecionados: " + listf);

		System.out.println("Informe a data de aluguel: (Ex: 22/12/2019)");
		String dataAluguel = sc.nextLine();
		Date data = new Filme().convertParaDate(dataAluguel);

		System.out.println("Digite o Id do Cliente: ");
		int id = sc.nextInt();
		sc.nextLine();

		Cliente bc = bCliente(id);
		System.out.println(bc);

		System.out.println("Digite o valor total do Aluguel: (Ex: 25.00)");
		String v = sc.nextLine();
		float valor = Float.parseFloat(v);

		try {
			Aluguel a = new Aluguel(1, listf, bc, data, valor);
			new AluguelDaoImpl().insert(a);
			System.out.println("\nResumo: \n\n" + a + "\n Aluguel cadastrado com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro ao cadastrar novo aluguel: " + e.getMessage());
		}
	}

	public void excluir() throws Exception {
		System.out.println("Digite o ID do aluguel que deseja excluir: ");
		Integer id = sc.nextInt();
		sc.nextLine();

		Aluguel al = new AluguelDaoImpl().find(id);

		if (al == null) {
			System.err.println("ID não encontrado, digite um Id válido. \n");
			excluir();
		}

		System.out.println(al + "Confirmar a exclusão do aluguel? \n1)Sim. \n2)Inserir outro ID. \n3)Sair");
		int id2 = sc.nextInt();
		sc.nextLine();

		switch (id2) { // Usando switch case para escolher a opção

		case 1:
			try {
				new AluguelDaoImpl().delete(al);
				System.out.println("Excluído com sucesso!");
			} catch (Exception e1) {
				System.err.println("Erro ao excluir: " + e1.getMessage());
			}
			break;
		case 2:
			excluir();
			break;
		case 3:
			System.out.println("Finalizado!");
			break;

		}

	}

	public void alterar() {
		System.out.println("Digite o Id do Aluguel que deseja alterar: ");
		int idA = sc.nextInt();
		sc.nextLine();
		
		List<Filme> listf = alugarFilme();
		
		System.out.println("Digite o Id do Cliente: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe a data de aluguel: (Ex: 22/12/2019)");
		String dataAluguel = sc.nextLine();
		Date data = new Filme().convertParaDate(dataAluguel);

		System.out.println("Digite o valor total do Aluguel: ");
		String v = sc.nextLine();
		float valor = Float.parseFloat(v);

		try {
			new AluguelDaoImpl().edit(new Aluguel(idA, listf, new Cliente().setIdCliente(id), data, valor));
			System.out.println("Alterado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar novo aluguel: " + e.getMessage());
		}
	}

	public void buscar() {
		try {
			Collection<Object> a = new AluguelDaoImpl().list();

			System.out.println("Lista de Clientes: ");
			System.out.println("");
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		}
	}

	public void buscarPorId() {
		System.out.println("Digite o id do Aluguel que deseja buscar: ");
		Integer id = sc.nextInt();

		try {
			Aluguel a = new AluguelDaoImpl().find(id);

			System.out.println("Aluguel encontrado: ");
			System.out.println("");
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		}

	}

}
