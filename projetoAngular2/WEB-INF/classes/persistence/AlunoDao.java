package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class AlunoDao  extends Dao{
	
	 
	   public void create(Aluno a) throws Exception{
		    open();
		      stmt = con.prepareStatement("insert into aluno values (null,?,?,?,?,?)  ");
		       stmt.setString(1, a.getNome());
		       stmt.setString(2, a.getDisciplina());
		       stmt.setDouble(3, a.getNota1());
		       stmt.setDouble(4, a.getNota2());
		      stmt.setString(5, a.getSituacao());
		      stmt.execute();
		    close();
	   }
	   
	   public List<Aluno> findAll() throws Exception{
		     open();
		      stmt = con.prepareStatement("select * from aluno");
		      rs = stmt.executeQuery();
		      List <Aluno> lista = new ArrayList<Aluno>();     
		       while(rs.next()) {
		      Aluno a = new Aluno();
		                a.setIdAluno(rs.getInt(1));
		                a.setNome(rs.getString(2));
		                a.setDisciplina(rs.getString(3));
		                a.setNota1(rs.getDouble(4));
		                a.setNota2(rs.getDouble(5));
		                a.setSituacao(rs.getString(6));
		    	 lista.add(a);  
	       }
		     close();
		     return lista;
	   }
	   
	   
	   public Aluno findByCode(Integer code) throws Exception{
		     open();
		      stmt = con.prepareStatement("select * from aluno where id=?");
		      stmt.setInt(1, code);
		      rs = stmt.executeQuery();
		      Aluno aluno=null;
		     if(rs.next()) {
		      aluno = new Aluno();
		                aluno.setIdAluno(rs.getInt(1));
		                aluno.setNome(rs.getString(2));
		                aluno.setDisciplina(rs.getString(3));
		                aluno.setNota1(rs.getDouble(4));
		                aluno.setNota2(rs.getDouble(5));
		                aluno.setSituacao(rs.getString(6));
	       }
		     close();
		     return aluno;
	   }
	   
	   
	   
	   public static void main(String[] args) {
		try {
			Aluno a = new Aluno(null,"carlos","java",9.,10.).gerarMedia().gerarSituacao();
			System.out.println("Aluno a :" + a);
			AlunoDao dao = new AlunoDao();
			dao.create(a);
			
		   System.out.println("Dados Gerados do ALuno :" + a);
			
		}catch(Exception ex) {
			 System.out.println("Error :" + ex.getMessage());
	
		}
		   
		   
		   
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 

}
