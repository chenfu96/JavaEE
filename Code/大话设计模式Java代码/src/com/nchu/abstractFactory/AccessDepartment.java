package com.nchu.abstractFactory;

public class AccessDepartment implements IDepartment {

	public void insert(Department department) {
		System.out.println("��Access �и�department������һ����¼");
	}

	public Department getDepartment(int id) {
		System.out.println("���ݸ�����id�õ�department���һ����¼");
		return null;
	}
}
