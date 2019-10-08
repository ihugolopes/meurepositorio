package persistence;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jcommon.encryption.SimpleMD5;

import entity.Usuario;

public class UsuarioDao {
	Session session;
	Transaction transaction;
	Criteria criteria;
	Query query;
	
	 public void criptografa(Usuario u) {
		  SimpleMD5 md5= new SimpleMD5(u.getSenha(),
				  "profedsonebelem@gmail.com#www.cotiinformatica.com.br");
		  u.setSenha(md5.toHexString());
	 }
	public void create(Usuario u ) throws Exception{
		criptografa(u);
		 session = HibernateUtil.getSessionFactory().openSession();
		  transaction =session.beginTransaction();
		     session.save(u);
		  transaction.commit();
		session.close(); 
	}
	
	public  Usuario findByLogin(Usuario u) {
		criptografa(u);
		 session = HibernateUtil.getSessionFactory().openSession();
		  query = session.createQuery(
 "select u from Usuario as u where u.email=:param1   and u.senha=:param2 ");
		  query.setParameter("param1", u.getEmail());
		  query.setParameter("param2", u.getSenha());
		  Usuario resposta = (Usuario) query.uniqueResult();
				  session.close();
		return  resposta;
	}
	
	public static void main(String[] args) {
		try {
			Usuario usuario= new Usuario();
			   usuario.setEmail("lu@gmail.com");
			   usuario.setSenha("123");
			   usuario.setNome("lu");
			   usuario.setPerfil("adm");
			UsuarioDao dao = new UsuarioDao();
			 //   dao.create(usuario);
            dao.create(usuario);
			System.out.println("Dados Gravados ...");
//			if (resposta!=null) {
//			   System.out.println("Usuario Logado :" + resposta);
//			}else {
//				 System.out.println("Usuario Nao Logado :" + resposta);
//			}
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
		
	}
	
	
	
	
	
	

}
