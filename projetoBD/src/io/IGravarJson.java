package io;

public interface IGravarJson<Classe>  {

	void open() throws Exception;
	
	void write(Classe c) throws Exception;
	
	void close() throws Exception;
	 
	
	
}
