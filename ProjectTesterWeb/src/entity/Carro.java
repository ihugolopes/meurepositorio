package entity;

import java.io.Serializable;

public class Carro  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer velocidadeAtual = 0;
	private int VelocidadeMax;
	private boolean tetosolar;
	private int NrMarchas;
	private boolean cambioautomatico;
	private int volumeDeCombustível;
	int nport, quantidadedekm;
	private Marca marca;
	Proprietario proprietario;

	public Carro() {
	}

	public Carro(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Carro(int velocidadeMax, boolean tetosolar, int nrMarchas, boolean cambioautomatico, int volumeDeCombustível,
			int nport, Proprietario proprietario, Marca marca) {

		VelocidadeMax = velocidadeMax;
		this.tetosolar = tetosolar;
		NrMarchas = nrMarchas;
		this.cambioautomatico = cambioautomatico;
		this.volumeDeCombustível = volumeDeCombustível;
		this.nport = nport;
		this.proprietario = proprietario;
		this.setMarca(marca);
	}

	public Boolean tetoSolar(Boolean teto) {
		if (teto == true) {
			this.tetosolar = true;
		} else {
			this.tetosolar = false;
		}
		return teto;
	}

	public int acelera(int acelera) {
		if (acelera == 1) {
			System.out.println("Iniciando teste de capacidade de aceleração na via: ");
			for (int i = 0; i <= this.VelocidadeMax; i++) {
				System.out.println("Acelerando: " + i + " Km/h");

				switch(i) {
				case 40: System.out.println("1ª Marcha selecionada..."); break;
				case 60: System.out.println("2ª Marcha selecionada..."); break;
				case 80: System.out.println("3ª Marcha selecionada..."); break;
				case 100:System.out.println("4ª Marcha selecionada..."); break;
				case 120:System.out.println("5ª Marcha selecionada..."); break;
				case 150:System.out.println("6ª Marcha selecionada..."); break;
				case 170:System.out.println("7ª Marcha selecionada..."); break;
				case 200:System.out.println("8ª Marcha selecionada..."); break;
				}
				
			}
			System.out.println("Teste concluído com sucesso!");
		}
		return acelera;
	}

	public Integer tanque(Integer vt) {
		if (vt >= 100) {
			System.out.println("Tanque cheio!");
			quantidadedekm = vt * 15;
			System.out.print("A quantidade média de autonomia com a quantidade atual de combustível é de: "
					+ quantidadedekm + " Km");
			System.out.println("");
		} else if (vt <= 99 && vt >= 60) {
			System.out.println("Tanque na capacidade média!");
			quantidadedekm = vt * 15;
			System.out.print("A quantidade média de autonomia com a quantidade atual de combustível é de:"
					+ quantidadedekm + " Km");
			System.out.println("");
		} else if (vt <= 15 && vt >= 1) {
			System.out.println("Tanque na reserva! Abasteça em no máximo 10km!");
			quantidadedekm = vt * 15;
			System.out.print("A quantidade média de autonomia com a quantidade atual de combustível é de: "
					+ quantidadedekm + " Km");
			System.out.println("");
		} else if (vt == 0) {
			System.out.println("Sem combustível!");
			quantidadedekm = vt * 15;
			System.out.print("A quantidade média de autonomia com a quantidade atual de combustível é de: "
					+ quantidadedekm + " Km");
			System.out.println("");
		}
		System.out.println("Quantidade atual em Litros: ");
		return vt;
	}

	public boolean freiar(boolean freia) {
		if (freia == true) {

			for (int i = this.VelocidadeMax; i >= 0; i--) {
				
				
				
				if (i == 0) {
					System.out.println("Frenagem efetuada. A velocidade atual é de 0Km/h");
					System.out.println("Teste de frenagem completado com sucesso!");
				} else if (i == 20) {
					System.out.println("Freiando: 20Km/h");
				} else if (i == 40) {
					System.out.println("Freiando: 40Km/h");
				} else if (i == 60) {
					System.out.println("Freiando: 60Km/h");
				} else if (i == 80) {
					System.out.println("Freiando: 80Km/h");
				} else if (i == 100) {
					System.out.println("Freiando: 100Km/h");
				} else if (i == 120) {
					System.out.println("Freiando: 120Km/h");
				}
				this.velocidadeAtual = i;
			}
		}
		return freia;
	}

	public int trocaM(int trocaM) {
		System.out.println("Trocando para " + trocaM + "ª Marcha...");
		System.out.println(trocaM + "ª Marcha selecionada!");
		if (trocaM == 1) {
			this.velocidadeAtual = 20;
		} else if (trocaM == 2) {
			this.velocidadeAtual = 40;
		} else if (trocaM == 3) {
			this.velocidadeAtual = 60;
		} else if (trocaM == 4) {
			this.velocidadeAtual = 80;
		} else if (trocaM == 5) {
			this.velocidadeAtual = 100;
		} else if (trocaM == 6) {
			this.velocidadeAtual = 120;
		} else if (trocaM == 7) {
			this.velocidadeAtual = 150;
		} else if (trocaM == 8) {
			this.velocidadeAtual = 170;
		} else if (trocaM == 9) {
			this.velocidadeAtual = 190;
		} else if (trocaM == 10) {
			this.velocidadeAtual = this.VelocidadeMax;
		}
		return trocaM;
	}

	public int re(int re) {
		if (this.velocidadeAtual > 0) {
			System.out.println("Ré proíbida, zere a velocidade!");
		} else {
			System.out.println("Ré engatada!");
		}
		return re;
	}

	@Override
	public String toString() {
		return "Carro: " + "\n" + " Velocidade Atual: " + velocidadeAtual + "\n" + ", Velocidade Máxima: "
				+ VelocidadeMax + "\n" + ", Teto solar? " + tetosolar + ", Número de Marchas: " + NrMarchas + "\n"
				+ ", Câmbioautomatico? " + cambioautomatico + "\n" + ", Volume de Combustível: " + volumeDeCombustível
				+ " Litros" + "\n" + ", Nª de Portas: " + nport;
	}

	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Integer velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMax() {
		return VelocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		VelocidadeMax = velocidadeMax;
	}

	public boolean isTetosolar() {
		return tetosolar;
	}

	public void setTetosolar(boolean tetosolar) {
		this.tetosolar = tetosolar;
	}

	public int getNrMarchas() {
		return NrMarchas;
	}

	public void setNrMarchas(int nrMarchas) {
		NrMarchas = nrMarchas;
	}

	public boolean isCambioautomatico() {
		return cambioautomatico;
	}

	public void setCambioautomatico(boolean cambioautomatico) {
		this.cambioautomatico = cambioautomatico;
	}

	public int getVolumeDeCombustível() {
		return volumeDeCombustível;
	}

	public void setVolumeDeCombustível(int volumeDeCombustível) {
		this.volumeDeCombustível = volumeDeCombustível;
	}

	public int getNport() {
		return nport;
	}

	public void setNport(int nport) {
		this.nport = nport;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
