package teoria;

public class Sobrescrita {

	public static void main(String[] args) {
		
		Estagiario e = new Estagiario(); 
		e.setNome("Hugo");
		e.setSalario(12000.);
		e.formatacao(1);
		System.out.println("");
		
		Funcionario f = new Estagiario();
		f.setNome("Edson");
		f.setSalario(5000.);
		f.formatacao(2);
	}
	
	
}
