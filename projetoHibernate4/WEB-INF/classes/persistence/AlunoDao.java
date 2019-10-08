package persistence;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Aluno;
import entity.Endereco;

public class AlunoDao {
 
	Session session;
	Transaction transaction;
	Criteria criteria;
	 Query query;
	
	  public void create(Aluno a, Endereco e)throws Exception{
		   session = HibernateUtil.getSessionFactory().openSession();
		     transaction = session.beginTransaction();
		     session.save(a); 
		               e.setAluno(a);
		        session.save(e); //grava o Endereco com chave estrangeiro    
		    transaction.commit();
		   session.close();
	  }
	  
	  public void delete(Aluno a)throws Exception{
		   session = HibernateUtil.getSessionFactory().openSession();
		     transaction = session.beginTransaction();
		         session.delete(a);
		    transaction.commit();
		   session.close();
	  }
	  
	  public List<Aluno> findAll(){
		   session = HibernateUtil.getSessionFactory().openSession();
		  List<Aluno> lista =  session.createQuery("select obj from Aluno as obj").list();
		   session.close();
		   return lista;
	  }
	  
	  //Busca o aluno e o endereco 
	  public Aluno findByCode(Integer cod) {
		  session = HibernateUtil.getSessionFactory().openSession();
		   Aluno aluno = (Aluno) session.get(Aluno.class,  cod);
		   session.close();
		   return aluno;
	  }
	  
	  
	  public void updateAluno(Aluno a)throws Exception{
		  session = HibernateUtil.getSessionFactory().openSession();
		  transaction = session.beginTransaction();
		       session.update(a);
		    transaction.commit();
		  session.close();
	  }
	  public void updateEndereco(Endereco e)throws Exception{
		  session = HibernateUtil.getSessionFactory().openSession();
		  transaction = session.beginTransaction();
		       session.update(e);
		    transaction.commit();
		  session.close();
	  }
	  
	  public static void main(String[] args) {
		try {
			Aluno a = new Aluno(null,"isac","isac@gmail.com");
			Endereco ender= new Endereco
            (null, "Av Rio Branco, 185","Centro","Rio de Janeiro", "RJ","20040007");
			ender.setAluno(a);
	AlunoDao dao = new AlunoDao();
//			dao.create(a, ender);
//			 //select * from aluno;
			//select * from endereco;
			 //System.out.println("Tabelas Geradas com Sucesso" + a);
	  List <Aluno> alunos  = dao.findAll();
	 System.out.println(alunos);
	 System.out.println(alunos.get(0).getEndereco());
			
	 
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		  
		  
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	
}
