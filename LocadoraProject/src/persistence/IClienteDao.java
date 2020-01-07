package persistence;

import java.util.Collection;

import entity.Cliente;

public interface IClienteDao {

	void insert(Cliente cliente) throws Exception;

    public Integer getNextId() throws Exception;

    void edit(Cliente cliente) throws Exception;

    void delete(Integer idCliente) throws Exception;

    Cliente find(Integer idCliente) throws Exception;

    Collection<Cliente> list() throws Exception;
	
}
