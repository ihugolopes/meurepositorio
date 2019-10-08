package persistence;

import entity.Endereco;

public class EnderecoDao extends Dao {

	public void create(Endereco e) throws Exception {
		open();
		stmt = con.prepareStatement("insert into endereco values(?,?,?,?,?,?)");
		stmt.setString(1, e.getRua());
		stmt.setString(2, e.getComplemento());
		stmt.setString(3, e.getBairro());
		stmt.setString(4, e.getCidade());
		stmt.setString(5, e.getEstado());
		stmt.setString(6, e.getCep());
		stmt.execute();
		close();
	}
}
