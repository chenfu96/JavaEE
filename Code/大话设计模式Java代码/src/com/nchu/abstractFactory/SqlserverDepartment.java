package com.nchu.abstractFactory;

public class SqlserverDepartment implements IDepartment {

	public void insert(Department department) {
		System.out.println("��SQL server �и�department������һ����¼");
	}

	public Department getDepartment(int id) {
		System.out.println("���ݸ�����id�õ�department���һ����¼");
		return null;
	}
}
