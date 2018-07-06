package com.nchu.abstractFactory;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
//		IFactory factory = new SqlServerFactory();
		IFactory factory = new AccessFactory();
		
		IUser iu = factory.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.createDepartment();
		
		id.insert(department);
		id.getDepartment(1);
	}
}
