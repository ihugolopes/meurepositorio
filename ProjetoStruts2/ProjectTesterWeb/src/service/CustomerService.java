package service;

import persistence.Dao;

public class CustomerService extends Dao {
	
	public void create(String name, Integer age, String email, String telephone) throws Exception {
		open();
		stmt = con.prepareStatement("insert into customer values(null,?,?,?,?)");
		stmt.setString(1, name);
		stmt.setInt(2, age);
		stmt.setString(3, email);
		stmt.setString(4, telephone);
		stmt.execute();
		close();
	}

	
	public static void main(String[] args) {
		CustomerService cs = new CustomerService();
		
		String name = "Carlos";
		int age = 24;
		String email = "carlos@gmail.com";
		String telephone = "8557-8965";
		
		try {
			cs.create(name, age, email, telephone);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
