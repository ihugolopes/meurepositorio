package entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Cliente {

	private Integer idCliente;
	private String  nome;
	private String  email;
	private Date    dataCadastro;
	
	//HasMany
	private List<Telefone> telefones;
	
		
	
	public Cliente() {
	
	}

	public Cliente(Integer idCliente, String nome, 
			       String email, Date dataCadastro) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.dataCadastro = dataCadastro;
	}
//   

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + 
				", nome=" + nome + ", email=" 
	    + email + ", dataCadastro=" +
    new SimpleDateFormat("dd/MM/yyyy").format(dataCadastro) 
    + "]";
	}

//24/11/2018 (data Formatada)	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	 //Um Telefone
	public void adicionar(Telefone t) {
		if (telefones==null) {
			telefones = new ArrayList<Telefone>();
		}
		telefones.add(t);
	}
	
	//Adicionando Varios Telefones ...
	//ao mesmo tempo ...
	public void adicionar(Telefone ...t) {
		if (telefones==null) {
			telefones = new ArrayList<Telefone>();
		}
		telefones.addAll(Arrays.asList(t));
	}
	
	

	public static void main(String[] args) {
	  
		Cliente c = new Cliente(1000,"exnine", "exnine@gmai.com",
				   new Date("11/24/2018"));
		
	    Telefone t1 = new Telefone(44,"9222-0000","celular");
		Telefone t2 = new Telefone(100,"2525-98201","celular");
		Telefone t3 = new Telefone(100,"4444-3333","celular");
		/*
		 c.adicionar(t1);
		 c.adicionar(t2);
		 c.adicionar(t3);
		 
		*/ 
		 c.adicionar(t1,t1,t3);
		
		
	  
		 
		 
		
		
	}

}

