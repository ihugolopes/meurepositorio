package persistence;

import java.util.Collection;

import entity.Aluguel;

public interface IAluguelDao {

	void insert( Aluguel aluguel) throws Exception;

    Integer getNextId() throws Exception;

    void edit(Aluguel aluguel) throws Exception;

    void delete(Aluguel aluguel) throws Exception;

    Aluguel find(Integer idAluguel) throws Exception;

    Collection<Object> list() throws Exception;
	
}
