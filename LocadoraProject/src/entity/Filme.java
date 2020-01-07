package entity;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Scanner;

import persistence.AluguelDaoImpl;
import persistence.FilmeDaoImpl;

public class Filme {

	private Integer idFilme;
	private Date dataLancamento;
	private String nome;
	private String descricao;
	static Scanner sc = new Scanner(System.in);

	public Filme() {
	}

	public Filme(Integer idFilme, Date dataLancamento, String nome, String descricao) {
		this.idFilme = idFilme;
		this.dataLancamento = dataLancamento;
		this.nome = nome;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Id do Filme: " + idFilme + "\nData de Lançamento: " + dataLancamento + "\nNome: " + nome
				+ "\nDescrição: " + descricao + "\n";
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public Filme setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
		return this;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public Filme setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Filme setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public Filme setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public Date convertParaDate(String valor) {
		Date data = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = new Date(sdf.parse(valor).getTime());
		} catch (Exception e) {
			System.out.println("Não foi possível converter a String para Date " + e.getMessage());
		}
		return data;

	}

	public void cadastrar() {
		System.out.println("Digite o Id do filme: ");
		Integer idFilme = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite a Data de Lançamento do filme: (dd/MM/aaaa)");
		String dataLancamento = sc.nextLine();
		Date dataLancamentoC = convertParaDate(dataLancamento);

		System.out.println("Digite o nome do filme: ");
		String nome = sc.nextLine();

		System.out.println("Digite a descrição do filme: ");
		String descricao = sc.nextLine();

		Filme f = new Filme(idFilme, dataLancamentoC, nome, descricao);

		try {
			new FilmeDaoImpl().insert(f);
			System.out.println("Cadastro efetuado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e.getMessage());
		}
		
		System.out.println("Deseja efetuar novo cadastro? 1) Sim | 2) Não ");
		int resp = sc.nextInt();
		sc.nextLine();
		
		if(resp == 1) {
		cadastrar();
		} else {
			System.out.println("Cadastro encerrado!");
		}
	}

	public void excluir() {
		System.out.println("Digite o id do filme que deseja excluir: ");
		Integer id = sc.nextInt();

		try {
			new FilmeDaoImpl().delete(id);
			new AluguelDaoImpl().find(id);
		} catch (Exception e) {
			System.out.println("Erro ao excluir: " + e.getMessage());
		}
	}

	public void alterar() {
		Filme f;
		System.out.println("Digite o id do filme que deseja alterar: ");
		Integer id = sc.nextInt();
		System.out.println("");
		System.out.println("Digite a Data de Lançamento: (Ex: 27/12/2017)");
		String dl = sc.nextLine();
		Date dataLancamento = convertParaDate(dl);
		System.out.println("Digite o novo nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite a nova descrição: ");
		String descricao = sc.nextLine();

		f = new Filme(id, dataLancamento, nome, descricao);

		try {
			new FilmeDaoImpl().edit(f);
		} catch (Exception e) {
			System.err.println("Erro ao alterar: " + e.getMessage());
		}
	}

	public void buscar() {
		try {
			Collection<Filme> f = new FilmeDaoImpl().list();

			System.out.println("Lista de Filmes: ");
			System.out.println("");
			System.out.println(f);
		} catch (Exception e) {
			System.err.println("Erro ao listar: " + e.getMessage());
		}
	}

	public void buscarPorId() {
		System.out.println("Digite o Id do Filme que deseja buscar: ");
		Integer id = sc.nextInt();

		try {
			Filme f = new FilmeDaoImpl().find(id);
			
			if (f == null) {
				System.err.println("Filme não Encontrado!");
			}
			
			System.out.println("Filme encontrado: ");
			System.out.println("");
			System.out.println(f);
		} catch (Exception e) {
			System.err.println("Erro ao listar: " + e.getMessage());
		}

	}
	
	public Filme buscarPorIdp(int i) {
		try {
			Filme f = new FilmeDaoImpl().find(i);
			return f;
		} catch (Exception e) {
			System.err.println("Erro ao buscar: " + e.getMessage());
			return null;
		}
	}

}
