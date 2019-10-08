package persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Funcionario;
public class FuncionarioDao {
	
	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;
	
	 public void create(Funcionario f) throws Exception{
		   session = HibernateUtil.getSessionFactory().openSession();
		   transaction = session.beginTransaction();
		      session.save(f);
		  transaction.commit();
		  session.close();
	 }
	 public List<Funcionario> findAll(){
		 session = HibernateUtil.getSessionFactory().openSession();
	       List <Funcionario> lista = session.createQuery("from Funcionario").list();
		 session.close();
		 return lista;
	 }
	
	 public static void main(String[] args) {
		 try {
			 FuncionarioDao dao = new FuncionarioDao();
	 Funcionario f = new Funcionario(null, "teste", "m", "teste@gmail.com", 
			  2000.);
			// dao.create(f);
	 System.out.println("Busca::" + dao.findAll());
		 //System.out.println("Dados Gravados :" + f);
	 
		 }catch(Exception ex) {
			 System.out.println("Error :" + ex.getMessage());
		 }
		 
	}
	 
	 
	 
	 
	 
	 
	  
	 
	  
	 
	 
	 
	 
	
	
}
