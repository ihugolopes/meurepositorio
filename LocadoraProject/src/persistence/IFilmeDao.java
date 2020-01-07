package persistence;

import java.util.Collection;

import entity.Filme;

public interface IFilmeDao {

	void insert(Filme filme) throws Exception;

    Integer getNextId() throws Exception;

    void edit(Filme filme) throws Exception;

    void delete(Integer idFilme) throws Exception;

    Filme find(Integer idFilme) throws Exception;

    Collection<Filme> list() throws Exception;
	
}
