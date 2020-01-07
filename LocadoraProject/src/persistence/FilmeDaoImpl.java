package persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import entity.Cliente;
import entity.Filme;

public class FilmeDaoImpl extends Dao implements IFilmeDao {

	@Override
	public void insert(Filme filme) throws Exception {
		Integer idFilme = this.getNextId();
		open();
		stmt = con.prepareStatement(
				"insert into en_filme (id_filme, data_lancamento, nome, descricao) values (?, ?, ?, ?)");
		stmt.setInt(1, idFilme);
		stmt.setDate(2, filme.getDataLancamento());
		stmt.setString(3, filme.getNome());
		stmt.setString(4, filme.getDescricao());
		stmt.execute();
		close();

		filme.setIdFilme(idFilme);
	}

	@Override
	public Integer getNextId() throws Exception {
		open();
		stmt = con.prepareStatement("select nextval('seq_en_filme')");
		rs = stmt.executeQuery();
		rs.next();
		close();
		return rs.getInt(1);
	}

	@Override
	public void edit(Filme f) throws Exception {
		open();
		try {
			stmt = con.prepareStatement("update en_filme set data_lancamento=(?), nome=(?), descricao=(?) where id_filme = (?)");
			stmt.setDate(1, f.getDataLancamento());
			stmt.setString(2, f.getNome());
			stmt.setString(3, f.getDescricao());
			stmt.setInt(4, f.getIdFilme());
			stmt.execute();
			close();

		} catch (Exception e) {
			System.out.println("Erro ao editar: " + e.getMessage());
		} finally {
			close();
		}
	}

	@Override
	public void delete(Integer idFilme) throws Exception {
		open();
		stmt = con.prepareStatement("delete from en_filme where id_filme = ?");
		stmt.setInt(1, idFilme);
		stmt.execute();
		close();

	}

	@Override
	public Filme find(Integer idFilme) throws Exception {
		open();
		stmt = con.prepareStatement("select * from en_filme where id_filme = ?");

		stmt.setInt(1, idFilme);

		rs = stmt.executeQuery();

		if (!rs.next()) {
			return null;
		}
		close();
		String nome = rs.getString("nome");
		Date dataLancamento = rs.getDate("data_lancamento");
		String descricao = rs.getString("descricao");
		return new Filme(idFilme, dataLancamento, nome, descricao);
	}

	@Override
	public Collection<Filme> list() throws Exception {
		open();
		Collection<Filme> lista = new ArrayList<>();

		stmt = con.prepareStatement("select id_filme, data_lancamento, nome, descricao from en_filme");
		rs = stmt.executeQuery();

		while (rs.next()) {
			Filme f = new Filme();
			f.setIdFilme(rs.getInt("id_filme"));
			f.setNome(rs.getString("nome"));
			f.setDataLancamento(rs.getDate("data_lancamento"));
			f.setDescricao(rs.getString("descricao"));
			lista.add(f);
		}
		close();
		return lista;
	}

}
