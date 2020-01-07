package persistence;

import java.util.ArrayList;
import java.util.Collection;

import entity.Cliente;

public class ClienteDaoImpl extends Dao implements IClienteDao {

	@Override
	public void insert(Cliente cliente) throws Exception {
		Integer idCliente = this.getNextId();
		open();
		stmt = con.prepareStatement("insert into en_cliente (id_cliente, nome) values (?, ?)");

		stmt.setInt(1, idCliente);
		stmt.setString(2, cliente.getNome());
		stmt.execute();
		close();

		cliente.setIdCliente(idCliente);
	}

	@Override
	public void edit(Cliente cliente) throws Exception {
		open();
		stmt = con.prepareStatement("update en_cliente set nome = (?) where id_cliente = (?)");

		stmt.setString(1, cliente.getNome());
		stmt.setInt(2, cliente.getIdCliente());
		stmt.execute();
		close();
	}

	@Override
	public void delete(Integer idCliente) throws Exception {
		open();
		stmt = con.prepareStatement("delete from en_cliente where id_cliente = ?");

		stmt.setInt(1, idCliente);

		stmt.execute();
		close();

	}

	@Override
	public Collection<Cliente> list() throws Exception {
		open();
		Collection<Cliente> lista = new ArrayList<>();

		stmt = con.prepareStatement("select id_cliente, nome from en_cliente");
		rs = stmt.executeQuery();

		while (rs.next()) {
			Cliente c = new Cliente();
			c.setIdCliente(rs.getInt("id_cliente"));
			c.setNome(rs.getString("nome"));

			lista.add(c);
		}
		close();
		return lista;
	}

	@Override
	public Cliente find(Integer idCliente) throws Exception {
		open();
		stmt = con.prepareStatement("select * from en_cliente where id_cliente = ?");

		stmt.setInt(1, idCliente);

		rs = stmt.executeQuery();

		if (!rs.next()) {
			return null;
		}
		close();
		String nome = rs.getString("nome");
		return new Cliente(idCliente, nome);
	}

	@Override
	public Integer getNextId() throws Exception {
		open();
		stmt = con.prepareStatement("select nextval('seq_en_cliente')");
		rs = stmt.executeQuery();
		rs.next();
		close();
		return rs.getInt(1);
	}

}
