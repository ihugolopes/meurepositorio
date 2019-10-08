package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable{
 	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  id;
	@Column(length=50)
	private String   nome;
	@Column(columnDefinition="    enum ('m', 'f')   ")
	private String   sexo;
	@Column(unique=true)
	private String   email;
	@Column
	private Double  salario;
	
	public Funcionario() {
	}
	
	public Funcionario(Integer id, String nome, String sexo, String email, Double salario) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", email=" + email + ", salario="
				+ salario + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
}
