package entity;

import java.util.ArrayList;
import java.util.List;

public class Motorista {

	private Integer idMotorista;
	private String nome;
	//CAIXA variavel static nao precis de set e get
	//Constante ... final ...
    public static Integer PONTOS = 20; 
    private List<Infracao> infracoes;

    
	public Integer getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(Integer idMotorista) {
		this.idMotorista = idMotorista;
	}



	public List<Infracao> getInfracoes() {
		return infracoes;
	}

	public void setInfracoes(List<Infracao> infracoes) {
		this.infracoes = infracoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarInfracao(Infracao i) {
		if (infracoes ==null) {
			infracoes = new ArrayList<Infracao>();
		}
       PONTOS = PONTOS  + i.getPonto();
         infracoes.add(i);
	}
	

    
	
	
}
