package gson;

import java.util.List;

import entity.Marca;

public interface IGsonMarcas {

	public void open() throws Exception;

	public void create(List<Marca> marcas) throws Exception;

	public void close() throws Exception;
}
