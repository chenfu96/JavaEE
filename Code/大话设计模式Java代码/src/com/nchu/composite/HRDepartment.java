package com.nchu.composite;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	public void add(Company company) {
		
	}

	public void remove(Company company) {
		
	}

	public void display(int depth) {
		System.out.println(new String(name + depth));
	}

	public void lineOfDuty() {
		System.out.println(name + "员工招聘培训管理！");
	}
}
