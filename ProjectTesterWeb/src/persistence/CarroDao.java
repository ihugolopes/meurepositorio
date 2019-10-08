package persistence;

import entity.Carro;
import entity.Marca;

public class CarroDao extends Dao {
	
	public void create(Carro c, Marca m) throws Exception {
		open();
		stmt = con.prepareStatement("insert into carro values(?,?,?,?,?,?,?,?,?,?,?)");
		
		stmt.setString(1, m.getCor());
		stmt.setString(2, m.getModelo());
		stmt.setInt(3, m.getAno());
		stmt.setString(4, m.getChassi());
		stmt.setString(5, m.getNomeDaMarca());
		stmt.setInt(6, c.getVelocidadeMax());
		stmt.setBoolean(7, c.isTetosolar());
		stmt.setInt(8, c.getNrMarchas());
		stmt.setBoolean(9, c.isCambioautomatico());
		stmt.setInt(10, c.getVolumeDeCombustível());
		stmt.setInt(11, c.getNport());
		
		stmt.execute();
		close();
	}

}
