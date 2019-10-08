package persistence;

import entity.Carro;
import entity.Marca;
import entity.Proprietario;

public class CarroDao extends Dao {
	
	public void create(Carro c, Proprietario p, Marca m) throws Exception {
		open();
		stmt = con.prepareStatement("insert into carro values(?,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setString(2, m.getCor());
		stmt.setString(3, m.getModelo());
		stmt.setInt(4, m.getAno());
		stmt.setString(5, m.getChassi());
		stmt.setString(6, m.getNomeDaMarca());
		stmt.setInt(7, c.getVelocidadeMax());
		stmt.setBoolean(8, c.isTetosolar());
		stmt.setInt(9, c.getNrMarchas());
		stmt.setBoolean(10, c.isCambioautomatico());
		stmt.setInt(11, c.getVolumeDeCombustível());
		stmt.setInt(12, c.getNport());
		
		stmt.execute();
		close();
	}

}
