package entity;

import com.opensymphony.xwork2.ActionSupport;

import service.CustomerService;

@SuppressWarnings("serial")
public class CustomerAction extends ActionSupport {

	private String name;
	private Integer age;
	private String email;
	private String telephone;
	private CustomerService cs;

	public String execute() throws Exception {
		if (name != null && email != null) {
			cs.create(name, age, email, telephone);
			addActionMessage(getText("msg.salvarcustomer"));
			return "success";
		} else {
			addActionError(getText("errors.salvarcustomer"));
			return "input";

		}
	}

	public CustomerService getCs() {
		return cs;
	}

	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

	public CustomerAction() {
	}

	public CustomerAction(String name, Integer age, String email, String telephone) {
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
