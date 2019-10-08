package gson;

import java.util.List;

import entity.Proprietario;


public interface IGsonProprietario {
	public void open() throws Exception;

	public void create(List<Proprietario> proprietarios) throws Exception;

	public void close() throws Exception;
}
