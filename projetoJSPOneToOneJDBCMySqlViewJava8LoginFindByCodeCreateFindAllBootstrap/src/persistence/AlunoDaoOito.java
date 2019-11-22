package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

//CLASSE QUE DEMONSTRA O JAVA 8

public class AlunoDaoOito extends AlunoDao {

	static List<Aluno> alunos = new ArrayList<Aluno>();

	static {
		try {
			alunos = new AlunoDaoOito().findAll();
		} catch (Exception ex) {
		}
	}

	public Aluno logar(String vemail, String vsenha) throws Exception {
		Aluno resposta = alunos.stream().filter(x -> x.getEmail().equals(vemail) && x.getSenha().equals(vsenha))
				.findAny().orElseThrow(() -> new Exception("Dados não encontrados!"));
		return resposta;
	}

	public Aluno findById(Long id) throws Exception {
		Aluno resposta = alunos.stream().filter(x -> x.getIdAluno().equals(id)).findAny()
				.orElseThrow(() -> new Exception("ID não encontrado!"));
		return resposta;
	}

	public static void main(String[] args) {
		try {

			Aluno a = new Aluno(null, null, "hugo@gmail.com", "123");
			
			AlunoDaoOito dao = new AlunoDaoOito();
			Aluno resposta = dao.logar(a.getEmail(), a.getSenha());
			System.out.println("Logado :" + resposta);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
