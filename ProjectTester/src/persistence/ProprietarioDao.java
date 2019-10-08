package persistence;

import entity.Proprietario;

public class ProprietarioDao extends Dao {

	public void create(Proprietario p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into proprietario values(?,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getCpf());
		stmt.setString(3, p.getRg());
		stmt.setString(4, p.getDataNascimento());
		stmt.execute();
		close();
	}
}
