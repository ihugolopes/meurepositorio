package entity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idFuncionario;
	private String nome;
	private String setor;
	private transient Double salario = 10000.; // Transiente diz que esse atributo não deve ser serializado
	private transient Integer idade = 20;
	private String sexo;

	public Funcionario() {
	}

	public Funcionario(Long idFuncionario, String nome, String setor, Double salario, Integer idade) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.idade = idade;
	}

	public Funcionario(Long idFuncionario, String nome, String setor, Double salario, Integer idade, String sexo) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
		this.idade = idade;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", setor=" + setor + ", sexo=" + sexo
				+ "]";
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\hugo.lopes\\Downloads\\fileserver"); //Serializa
			ObjectOutputStream dos = new ObjectOutputStream(fos);
			Funcionario f = new Funcionario(100l, "Hugo", "Dev", 8000., 24);
				dos.writeObject(f);
				dos.flush();
				dos.close();
			
			FileInputStream fin = new FileInputStream("C:\\Users\\hugo.lopes\\Downloads\\fileserver"); //Deserializa com campos indicados Transient em NULL
			ObjectInputStream din = new ObjectInputStream(fin);
			Funcionario func = (Funcionario) din.readObject();
			System.out.println(func);
				din.close();
				fin.close();
		} catch (Exception e) {
			System.out.println("Serializa!");
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
