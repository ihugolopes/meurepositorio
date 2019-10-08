package persistence;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Produto;
@Stateless
@LocalBean
public class ProdutoBean {
	 //3 coisas ( Classe a Entidade)
	 //Banco de Dados no Wildfly 10
	// Bean de Sessão ativei o jpa
	//ProdutoBan (Classe Bean_ Gravacao --> DAO)
	@PersistenceContext(name="cafezinhoPU")
    EntityManager manager;
   
    public void create(Produto p) {
    	     manager.persist(p);
     }
   
     public List<Produto> findAll(){
    	 return manager.createQuery("select p from Produto as p", Produto.class)
    			  .getResultList();
     }
     
     public Produto findByCode(Integer code){
    	  return  manager.find(Produto.class, code);
     }
     

}
