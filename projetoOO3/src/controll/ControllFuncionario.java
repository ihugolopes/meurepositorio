package controll;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import entity.Funcionario;

public class ControllFuncionario {

	private List<Funcionario> funcionarios;
	// antes do Construtor

	{
		funcionarios = new ArrayList<Funcionario>();
	}

	public ControllFuncionario() {
	}

	public void adicionar(Funcionario f) {
		this.funcionarios.add(f);
	}

	// buscar pelo codigo
	// Filtrar...
	public Funcionario buscarCodigo(Long code) {
		Funcionario resposta = funcionarios.stream().filter(a -> a.getId().equals(code)).findAny().orElse(null);
		return resposta;
	}

	// Mostrar o nome de todos os funcionarios
	// Mapear()
	public List<String> buscarNomes() {
		List<String> nomes = funcionarios.stream().		// map(a->a.getNome()+","+a.getEmail()).
				map(a -> a.getNome()).collect(Collectors.toList());
		// buscando todos os nomes e esquecendo o Resto
		return nomes;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public static void main(String[] args) {
		
		ControllFuncionario c = new ControllFuncionario();
		c.adicionar(new Funcionario(10l, "carlos", "carlos@gmail.com", 10000., 500.));
		c.adicionar(new Funcionario(11l, "manoel", "manoel@gmail.com", 5000., 500.));
		c.adicionar(new Funcionario(12l, "aline", "aline@gmail.com", 7000., 500.));

		System.out.println(c.getFuncionarios());

		for (String nome : c.buscarNomes()) {
			System.out.println(nome);
		}

		System.out.println("Dados :" + c.buscarCodigo(10l));
	}
}
