package entity;

public class Infracao {

	private Integer idInfracao;
	private String  infracao;
	private Integer ponto;

	 
	
	@Override
	public String toString() {
		return "Infracao [idInfracao=" + idInfracao + ", infracao=" + infracao + ", ponto=" + ponto + "]";
	}
	public Integer getIdInfracao() {
		return idInfracao;
	}
	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}
	public String getInfracao() {
		return infracao;
	}
	public void setInfracao(String infracao) {
		this.infracao = infracao;
	}
	public Integer getPonto() {
		return ponto;
	}
	public void setPonto(Integer ponto) {
		this.ponto = ponto;
	}
 
	public static void main(String[] args) {
		
		// Motorista.PONTOS = 10; dinamica 
		
		
		
		
		
		
       Motorista mot = new Motorista();
        mot.setIdMotorista(8000);
        mot.setNome("alexandre");
        
        Infracao inf = new Infracao();
           inf.setIdInfracao(1);   
           inf.setInfracao("gravissimo, avanco de sinal");
           inf.setPonto(-7);
        
        mot.adicionarInfracao(inf);
        
        System.out.println("Nome " +mot.getNome());
        System.out.println("Pontos " +mot.PONTOS);
        mot.getInfracoes().forEach(System.out::println);
       
        Infracao inf2 = new Infracao();
           inf2.setIdInfracao(2);   
           inf2.setInfracao("Direcao Perigosa Ultrapassagem");
           inf2.setPonto(-7);
           mot.adicionarInfracao(inf2);
         
      System.out.println("Nome " +mot.getNome());
      System.out.println("Pontos " +mot.PONTOS);
      mot.getInfracoes().forEach(System.out::println);     
		
      //Se a quantidade de pontos do MOtorista, for maior
      //que 20, carteira suspensa ... Escolinha 
      //Exibir 
      
      
	}
	
	
	
	
}
