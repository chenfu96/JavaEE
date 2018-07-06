package com.nchu.abstractFactory;

public class AccessFactory implements IFactory {

	public IUser createUser() {
		return new AccessUser();
	}

	public IDepartment createDepartment() {
		return new AccessDepartment();
	}
}
