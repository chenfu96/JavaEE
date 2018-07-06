package com.nchu.abstractFactory;

public class Client1 {

	public static void main(String[] args) throws Exception {
		SqlserverDepartment sqlserverDepartment = (SqlserverDepartment) DateAccess.createDepartment();
		SqlserverUser sqlserverUser = (SqlserverUser) DateAccess.createUser();
		
		Department department = new Department();
		User user = new User();
		
		sqlserverDepartment.insert(department);
		sqlserverUser.insert(user);
	}
}
