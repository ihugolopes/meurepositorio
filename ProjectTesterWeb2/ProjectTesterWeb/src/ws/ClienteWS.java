package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entity.Cliente;
import entity.Filtro;
import entity.Filtros;
import entity.ListaClientes;
import exception.ClienteException;
import persistence.ClienteDao;
import persistence.Dao;

@WebService
public class ClienteWS extends Dao {

	ClienteDao dao = new ClienteDao();

	@WebMethod(operationName = "ListandoClientes")
	@WebResult(name = "Cliente")
	public ListaClientes findAll(@WebParam(name = "filtro") Filtros filtros) throws ClienteException, Exception {
		System.out.println("Chamando findAll()");

		List<Filtro> listaf = filtros.findAll();
		List<Cliente> lista = dao.findAll(listaf);

		if (listaf.get(0).getSucursal().isEmpty()) {
			throw new ClienteException(1);
		}

		if (!lista.get(0).getSucursal().contains(listaf.get(0).getSucursal())) {
			throw new ClienteException(2);
		}

		if (listaf.get(0).getItem().isEmpty()) {
			throw new ClienteException(3);
		}

		if (!listaf.get(0).getItem().contains(lista.get(0).getItem())) {
			throw new ClienteException(4);
		}

		if (listaf.get(0).getRamo().isEmpty()) {
			throw new ClienteException(5);
		}

		if (!listaf.get(0).getRamo().contains(lista.get(0).getRamo())) {
			throw new ClienteException(6);
		}

		if (listaf.get(0).getNumeroApolice().isEmpty()) {
			throw new ClienteException(7);
		}

		if (!listaf.get(0).getNumeroApolice().contains(lista.get(0).getNumeroApolice())) {
			throw new ClienteException(8);
		}

		return new ListaClientes(lista);

	}

}
