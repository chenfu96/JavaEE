package com.nchu.abstractFactory;

public class SqlserverDepartment implements IDepartment {

	public void insert(Department department) {
		System.out.println("在SQL server 中给department表增加一条记录");
	}

	public Department getDepartment(int id) {
		System.out.println("根据给定的id得到department表的一条记录");
		return null;
	}
}
