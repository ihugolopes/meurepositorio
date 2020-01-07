package entity;

import java.util.Collection;
import java.util.Scanner;

import persistence.ClienteDaoImpl;

public class Cliente {

	private Integer idCliente;
	private String nome;
	static Scanner sc = new Scanner(System.in);

	public Cliente() {
	}

	public Cliente(Integer idCliente, String nome) {
		this.idCliente = idCliente;
		this.nome = nome;
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Id do Cliente: " + idCliente + "\nNome: " + nome + "\n";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public Cliente setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Cliente setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public void cadastrar() {
		System.out.println("Digite o id do cliente: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		Cliente c = new Cliente(id, nome);

		try {
			new ClienteDaoImpl().insert(c);
			
			System.out.println("Salvo com sucesso, " + c);
		} catch (Exception e) {
			System.err.println("Erro ao cadastrar: " + e.getMessage());
		}

	}

	public void excluir() {
		System.out.println("Digite o id do cliente que deseja excluir: ");
		Integer id = sc.nextInt();

		try {
			new ClienteDaoImpl().delete(id);
			System.out.println("Cliente de ID \"" + id + "\" excluído com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro ao excluir: " + e.getMessage());
		}
	}

	public void alterar() {
		System.out.println("Digite o id do cliente que deseja alterar: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		Cliente c = new Cliente(id, nome);

		try {
			new ClienteDaoImpl().edit(c);
			System.out.println("Alterado com sucesso!");
			Cliente cliente = new ClienteDaoImpl().find(id);
			System.out.println("Novo " + cliente);
		} catch (Exception e) {
			System.err.println("Erro ao alterar: " + e.getMessage());
		}
	}

	public void buscar() {
		try {
			Collection<Cliente> clientes = new ClienteDaoImpl().list();

			System.out.println("Lista de Clientes: ");
			System.out.println("");
			System.out.println(clientes);
		} catch (Exception e) {
			System.err.println("Erro ao listar: " + e.getMessage());
		}

	}

	public void buscarPorId() {
		System.out.println("Digite o id do cliente que deseja buscar: ");
		Integer id = sc.nextInt();

		try {
			Cliente cliente = new ClienteDaoImpl().find(id);

			if(cliente.getIdCliente() != id) {
				System.err.println("O ID do cliente informado não existe!");
			} else {
			System.out.println("Cliente encontrado: ");
			System.out.println("");
			System.out.println(cliente);
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar: " + e.getMessage());
		}

	}

}
