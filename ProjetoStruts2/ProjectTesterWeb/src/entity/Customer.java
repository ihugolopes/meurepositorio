package entity;

public class Customer {

	private String name;
	private Integer age;
	private String email;
	private String telephone;

	public Customer() {
	}

	public Customer(String name, Integer age, String email, String telephone) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", email=" + email + ", telephone=" + telephone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
