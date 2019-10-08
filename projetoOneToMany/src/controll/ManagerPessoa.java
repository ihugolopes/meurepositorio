package controll;
import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;
public class ManagerPessoa {
	 private List<Pessoa> pessoas;
	 
	 public void adicionar(Pessoa p) {
		 if (pessoas==null) {
			 pessoas = new ArrayList<Pessoa>();
		 }
		 pessoas.add(p);
	 }
	 
	 public Pessoa buscarPeloCodigo(Integer cod) {
		   Pessoa resposta = 
				   pessoas.stream().
				     filter(a->a.getId().equals(cod))
				     .findAny()
				     .orElse(null);
		    //FindAny (encontrou traz)
		   //senao retorna vazio ...
		   return resposta;
	 }

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

    public static void main(String[] args) {
    	Pessoa p = new Pessoa();
    	    p.setId(10); p.setNome("xnine"); p.setIdade(20);
      Pessoa y = new Pessoa();
    	    y.setId(5); y.setNome("45dias"); y.setIdade(19);
    	    
	  ManagerPessoa bean = new ManagerPessoa();
	    bean.adicionar(p);
	    bean.adicionar(y);
	    
	    //toString de Pessoa do Codigo 10 ...
	   System.out.println(bean.buscarPeloCodigo(20));
	   
    	
    	
    	
    	
	}
	  
	 
	
    
    
    
    
    
    
}
