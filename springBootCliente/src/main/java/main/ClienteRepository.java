package main;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<Cliente, Long>{

       public   Cliente  findByNomeAndEmail(String nome, String email);
	 
	 
}
