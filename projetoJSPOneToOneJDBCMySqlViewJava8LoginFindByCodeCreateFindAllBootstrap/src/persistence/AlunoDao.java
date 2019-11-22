package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class AlunoDao extends Dao {

	public void create(Aluno a) throws Exception {
		open();
		stmt = con.prepareStatement("insert into aluno values (null,?,?,?)");
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getEmail());
		stmt.setString(3, a.getSenha());
		stmt.execute();
		close();
	}

	public List<Aluno> findAll() throws Exception {
		open();
		stmt = con.prepareStatement("select * from aluno");
		rs = stmt.executeQuery();
		List<Aluno> lista = new ArrayList<Aluno>();
		while (rs.next()) {
			Aluno a = new Aluno();
			a.setIdAluno(rs.getLong(1));
			a.setNome(rs.getString(2));
			a.setEmail(rs.getString(3));
			a.setSenha(rs.getString(4));
			lista.add(a);
		}
		close();
		return lista;
	}

}
