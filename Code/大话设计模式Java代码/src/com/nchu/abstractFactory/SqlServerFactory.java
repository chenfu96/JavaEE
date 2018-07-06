package com.nchu.abstractFactory;

public class SqlServerFactory implements IFactory {

	public IUser createUser() {
		return new SqlserverUser();
	}

	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}
}
