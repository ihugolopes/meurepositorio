package entity;
import java.util.Date;

//curso gratis (free)
//jquery toda sexta (12:00 as 13:00)
public class Movimentacao {
 
	private Integer idcorrentista;
	private String nome;
	private Double saldo;
	private String operacao;
	private Date data;	
	private Double valor;
	
	public Movimentacao() {
	}

 
	@Override
	public String toString() {
		return "Movimentacao [idcorrentista=" +
	idcorrentista + ", nome=" + nome + ", saldo=" 
				+ saldo + ", operacao="
				+ operacao + ", data=" + data + 
				", valor=" + valor + "]";
	}


	public Integer getIdcorrentista() {
		return idcorrentista;
	}


	public void setIdcorrentista(Integer idcorrentista) {
		this.idcorrentista = idcorrentista;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	public void retirada(Double valor) {
		 if (valor > this.saldo) {
 throw new IllegalArgumentException("Nao tem limite para Saque");
		 }else {
		 this.setSaldo(    this.saldo - valor    );
		 }
	}
	
	
	
	
	public void depositar(Double valor) {
		 this.setSaldo(this.saldo + valor );
	}
	
	
	
	public void transferir
	(Movimentacao de, Movimentacao para, Double valor) {
		if (valor > this.getSaldo()) {
throw new IllegalArgumentException("Nao tem limite para transferencia");			
		}
		else{
		  de.setSaldo(de.getSaldo() - valor);
		  para.setSaldo(para.getSaldo() + valor);	
		}
	}
	
	
	
	public static void main(String[] args) {
	try {
	Movimentacao m = new Movimentacao();
	   m.setIdcorrentista(10);
	   m.setNome("xnine");
	   m.setSaldo(8000.);
	   m.setOperacao("deposito");
	   m.setValor(3000.);  
	   
	   
	   m.depositar(m.getValor()); //executa a ação de depositar
	   
   System.out.println(m.getNome() + ",saldo=" + m.getSaldo());
   System.out.println(m.getValor()+"....");
   
   
        m.setOperacao("saque");
        System.out.println("Saque");
        System.out.println("---------------------45d");
        m.setValor(4000.);
        m.retirada(m.getValor());

  System.out.println(m.getNome() + "," + m.getSaldo());
  System.out.println(m.getValor());
       
	}catch(Exception ex) {
		System.out.println(ex.getMessage()); 
	}
       
         
       
     
     
    
    
	   
//   Movimentacao m = new Movimentacao();
//	   m.setIdcorrentista(30);
//	   m.setNome("filipi");
//	   m.setSaldo(10000.);
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
