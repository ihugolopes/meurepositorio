package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Endereco;
import entity.Usuario;

public class UsuarioDao {
	Session session;
	Transaction transaction;
	Query query;

	public void create(Usuario u, Endereco e) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(u); // primária e estrangeira ...
		e.setUsuario(u);
		session.save(e);
		transaction.commit();
		session.close();
	}

	public List<Usuario> findAll() {
		session = HibernateUtil.getSessionFactory().openSession();
		List<Usuario> lista = session.createQuery("from Usuario").list();
		session.close();
		return lista;
	}
	
	public void delete(Long cod) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		Usuario resp = (Usuario) session.get(Usuario.class, cod);
		session.delete(resp);
		transaction.commit();
		session.close();
	}

	public static void main(String[] args) {
		try {
			Usuario u = new Usuario(null, "Caio", "caio@gmail.com");
			Endereco e = new Endereco(null, "Av Cascata, 185", "Centro", "Rio", "RJ", "20002458", u);
//			new UsuarioDao().create(u, e);
//			System.out.println("Dados gravados!");
			System.out.println(new UsuarioDao().findAll());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
