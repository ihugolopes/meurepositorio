package persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import entity.Aluguel;
import entity.Cliente;
import entity.Filme;

public class AluguelDaoImpl extends Dao implements IAluguelDao {

	@Override
	public void insert(Aluguel a) throws Exception {
		Integer idAluguel = this.getNextId();
		open();
		stmt = con.prepareStatement(
				"insert into en_aluguel (id_aluguel, id_cliente, data_aluguel, valor) values (?, ?, ?, ?)");

		stmt.setInt(1, idAluguel);
		stmt.setInt(2, a.getCliente().getIdCliente());
		stmt.setDate(3, a.getDataAluguel());
		stmt.setDouble(4, a.getValor());
		stmt.execute();

		List<Filme> listaA = a.getFilmes();
		for (Filme filme : listaA) {
			stmt = con.prepareStatement("insert into falugados (id_aluguel, id_filme) values (?, ?)");
			stmt.setInt(1, idAluguel);
			stmt.setInt(2, filme.getIdFilme());
			stmt.execute();
		}
		close();
	}

	@Override
	public Integer getNextId() throws Exception {
		open();
		stmt = con.prepareStatement("select nextval('seq_en_aluguel')");
		rs = stmt.executeQuery();
		rs.next();
		close();
		return rs.getInt(1);
	}

	@Override
	public void edit(Aluguel a) throws Exception {
		open();
		stmt = con.prepareStatement("update en_aluguel set id_cliente=?, data_aluguel=?, valor=? where id_aluguel=?");
		stmt.setInt(1, a.getCliente().getIdCliente());
		stmt.setDate(2, a.getDataAluguel());
		stmt.setDouble(3, a.getValor());
		stmt.setInt(4, a.getIdAluguel());
		stmt.execute();

		List<Filme> listaA = a.getFilmes();
		for (Filme filme : listaA) {
			stmt = con.prepareStatement("update falugados set id_filme=? where id_aluguel=?");
			stmt.setInt(1, filme.getIdFilme());
			stmt.setInt(2, a.getIdAluguel());
			stmt.execute();
		}
		close();
	}

	@Override
	public void delete(Aluguel a) throws Exception {
		open();
		stmt = con.prepareStatement("delete from falugados where id_aluguel = ?");
		stmt.setInt(1, a.getIdAluguel());
		stmt.execute();
		close();

	}

	@Override
	public Aluguel find(Integer idAluguel) throws Exception {
		open();
		stmt = con.prepareStatement(
				"select f.id_aluguel, a.id_cliente, f.id_filme, a.valor, a.data_aluguel from en_aluguel a inner join falugados f on a.id_aluguel = f.id_aluguel where a.id_aluguel = (?)");

		stmt.setInt(1, idAluguel);

		rs = stmt.executeQuery();

		if (!rs.next()) {
			return null;
		}
		close();

		int ida = rs.getInt("id_aluguel");
		int idc = rs.getInt("id_cliente");
		int idf = rs.getInt("id_filme");
		float valor = rs.getFloat("valor");
		Date dA = rs.getDate("data_aluguel");

		Cliente cdao = new ClienteDaoImpl().find(idc);
		String nome = cdao.getNome();
		List<Filme> filmes = new ArrayList<Filme>();

		filmes.add(new FilmeDaoImpl().find(idf));

		while (rs.next()) {
			filmes.add(new FilmeDaoImpl().find(rs.getInt("id_filme")));
		}

		Aluguel aluguel = new Aluguel(ida, filmes, new Cliente(idc, nome), dA, valor);

		return aluguel;
	}

	@Override
	public Collection<Object> list() throws Exception {
		open();
		stmt = con.prepareStatement(
				"select a.id_cliente, a.id_aluguel, f.id_filme, a.data_aluguel, a.valor from en_aluguel a inner join falugados f \r\n"
						+ "on a.id_aluguel = f.id_aluguel");
		rs = stmt.executeQuery();

		List<Object> listar = new ArrayList<Object>();

		while (rs.next()) {
			int idc = rs.getInt("id_cliente");
			int ida = rs.getInt("id_aluguel");
			int idf = rs.getInt("id_filme");
			float valor = rs.getFloat("valor");
			Date dA = rs.getDate("data_aluguel");

			listar.add(ida);
			listar.add(idf);
			listar.add(idc);
			listar.add(dA);
			listar.add(valor);
		}

		close();

		return listar;
	}

}
