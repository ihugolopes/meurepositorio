package controll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Funcionario;

public class ControleFuncionario {

	static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	static {
		funcionarios.add(new Funcionario(10l, "lu", "programacao", 10000., 17, "f"));
		funcionarios.add(new Funcionario(11l, "vitu", "programacao", 9000., 19, "m"));
		funcionarios.add(new Funcionario(12l, "jander", "dba", 8000., 17, "m"));
	}

	public static List<Funcionario> listarProgramador(String vsetor) {
		Map<Boolean, List<Funcionario>> mapa = funcionarios.stream()
				.collect(Collectors.partitioningBy(a -> a.getSetor().equals(vsetor)));
		List<Funcionario> lista = mapa.get(Boolean.TRUE);
		return lista;
	}

	public static Map<Boolean, List<Funcionario>> listarSexo(String vsexo) {
		Map<Boolean, List<Funcionario>> mapa = funcionarios.stream()
				.collect(Collectors.partitioningBy(a -> a.getSexo().equals(vsexo)));
		return mapa;
	}

	public static void main(String[] args) {
		List<Funcionario> programadores = listarProgramador("programacao");
		List<Funcionario> dbas = listarProgramador("dba");
		programadores.stream().forEach(System.out::println);
		System.out.println("------------------------------");
		
		dbas.stream().forEach(System.out::println);
		Map<Boolean, List<Funcionario>> resposta = funcionarios.stream()
				.collect(Collectors.partitioningBy(a -> a.getIdade() <= 18));
		System.out.println(resposta);
		System.out.println("-----------------------------");
		
		Map<Boolean, List<Funcionario>> lista = new HashMap<Boolean, List<Funcionario>>();
		lista = listarSexo("f");
		System.out.println(lista.get(true));
	}

}
