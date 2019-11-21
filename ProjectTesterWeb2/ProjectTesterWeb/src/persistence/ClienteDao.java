package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;
import entity.Filtro;

public class ClienteDao extends Dao {
//	select * from dadospdf where item=1 and sucursal=175 and ramo=990 and companhia=244 and numeroapolice=545341;

	public String create(Cliente c) throws Exception {
		open();

		ClienteDao d = new ClienteDao();
		boolean res = d.consulta(c);

		if (res == false) {
			open();
			stmt = con.prepareStatement("insert into dadospdf values (?,?,?,?,?,?,?,?,?,?,?,?,?, null)");
			stmt.setString(1, c.getItem());
			stmt.setString(2, c.getNomeSegurado());
			stmt.setString(3, c.getCpfCnpjSegurado());
			stmt.setString(4, c.getTipoDocumento());
			stmt.setDate(5, c.getDataEmissao());
			stmt.setString(6, c.getSucursal());
			stmt.setString(7, c.getPlaca());
			stmt.setString(8, c.getRamo());
			stmt.setString(9, c.getCompanhia());
			stmt.setString(10, c.getCpdCorretor());
			stmt.setString(11, c.getChassi());
			stmt.setString(12, c.getNumeroApolice());
			stmt.setString(13, c.getNumeroEndosso());
			stmt.execute();
			close();
			return "Usuário salvo!";

		} else {
			open();
			stmt = con.prepareStatement(
					"update dadospdf set item=?, nomeSegurado=?, cpfCnpjSegurado=?, tipoDocumento=?, dataEmissao=?, sucursal=?, placa=?,"
							+ "ramo=?, companhia=?, cpdCorretor=?, chassi=?, numeroApolice=?, numeroEndosso=? "
							+ " where item=? and sucursal=? and ramo=? and companhia=? and numeroapolice=?");
			stmt.setString(1, c.getItem());
			stmt.setString(2, c.getNomeSegurado());
			stmt.setString(3, c.getCpfCnpjSegurado());
			stmt.setString(4, c.getTipoDocumento());
			stmt.setDate(5, c.getDataEmissao());
			stmt.setString(6, c.getSucursal());
			stmt.setString(7, c.getPlaca());
			stmt.setString(8, c.getRamo());
			stmt.setString(9, c.getCompanhia());
			stmt.setString(10, c.getCpdCorretor());
			stmt.setString(11, c.getChassi());
			stmt.setString(12, c.getNumeroApolice());
			stmt.setString(13, c.getNumeroEndosso());
			stmt.setString(14, c.getItem());
			stmt.setString(15, c.getSucursal());
			stmt.setString(16, c.getRamo());
			stmt.setString(17, c.getCompanhia());
			stmt.setString(18, c.getNumeroApolice());
			stmt.execute();
			close();

			return "Usuário alterado!";
		}

	}

	public List<Cliente> findAll(List<Filtro> listaf) throws Exception {
		open();
		List<Cliente> lista = new ArrayList<Cliente>(); // crio a lista
		stmt = con.prepareStatement("select * from dadospdf"); // consultar os dados
		rs = stmt.executeQuery(); // executando a consulta

		while (rs.next()) {
			Cliente c = new Cliente();
			c.setItem(rs.getString(1));
			c.setNomeSegurado(rs.getString(2));
			c.setCpfCnpjSegurado(rs.getString(3));
			c.setTipoDocumento(rs.getString(4));
			c.setDataEmissao(rs.getDate(5));
			c.setSucursal(rs.getString(6));
			c.setPlaca(rs.getString(7));
			c.setRamo(rs.getString(8));
			c.setCompanhia(rs.getString(9));
			c.setCpdCorretor(rs.getString(10));
			c.setChassi(rs.getString(11));
			c.setNumeroApolice(rs.getString(12));
			c.setNumeroEndosso(rs.getString(13));
			lista.add(c);
		}

		close();
		return lista;
	}
	
	public List<Cliente> findAll2() throws Exception {
		open();
		List<Cliente> lista = new ArrayList<Cliente>(); // crio a lista
		stmt = con.prepareStatement("select * from dadospdf"); // consultar os dados
		rs = stmt.executeQuery(); // executando a consulta

		while (rs.next()) {
			Cliente c = new Cliente();
			c.setItem(rs.getString(1));
			c.setNomeSegurado(rs.getString(2));
			c.setCpfCnpjSegurado(rs.getString(3));
			c.setTipoDocumento(rs.getString(4));
			c.setDataEmissao(rs.getDate(5));
			c.setSucursal(rs.getString(6));
			c.setPlaca(rs.getString(7));
			c.setRamo(rs.getString(8));
			c.setCompanhia(rs.getString(9));
			c.setCpdCorretor(rs.getString(10));
			c.setChassi(rs.getString(11));
			c.setNumeroApolice(rs.getString(12));
			c.setNumeroEndosso(rs.getString(13));
			lista.add(c);
		}

		close();
		return lista;
	}

	public Boolean consulta(Cliente c) throws Exception {
		open();
		boolean e = con.prepareStatement("select * from dadospdf where item=" + c.getItem() + " and sucursal= "
				+ c.getSucursal() + " and" + " ramo=" + c.getRamo() + " and companhia=" + c.getCompanhia()
				+ " and numeroapolice=" + c.getNumeroApolice() + "") != null;
		close();

		if (e == true) {
			return true;
		} else {
			return false;
		}

	}

	public boolean findByNumeroApolice() throws Exception {
		open();
		boolean result = false;
		stmt = con.prepareStatement("select * from dadospdf where numeroapolice=?");
		Cliente c = new Cliente();
		c.setNumeroApolice(rs.getString(13));

		close();
		return result;
	}

//	public Cliente findByCode(Integer cod) throws Exception{
//		open();
//			stmt = con.prepareStatement("select * from cliente where idCliente=?");
//			stmt.setInt(1, cod);
//			rs  = stmt.executeQuery();
//			Cliente c = null;
//			if (rs.next()){
//			c = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
//			}
//		close();
//		return c;
//	}	
//	
//	public void update(Cliente c) throws Exception{
//		open(); 
//			stmt = con.prepareStatement("update cliente set nome=?, email=? where idCliente=?");
//			stmt.setString(1, c.getNome());
//			stmt.setString(2, c.getEmail());
//			stmt.setInt(3, c.getIdCliente());
//			stmt.execute();
//			stmt.close();
//		close();
//	}	
//	
//	public void delete(Integer cod)throws Exception{
//	open();
//		stmt = con.prepareStatement("delete from cliente where idCliente=?");
//		stmt.setInt(1, cod);
//		stmt.execute();
//		stmt.close();
//	close();  
//	}

	public static void main(String[] args) throws Exception {
//		ClienteDao cdao = new ClienteDao();
//		List<Cliente> lc = cdao.findAll();
//		System.out.println(lc);

	}
}
