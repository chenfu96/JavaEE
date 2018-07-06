package com.nchu.composite;

public class FinanceDepartment extends Company {

	
	public FinanceDepartment(String name) {
		super(name);
	}

	public void add(Company company) {
		
	}

	public void remove(Company company) {
		
	}

	public void display(int depth) {
		System.out.println(name + depth);
	}

	public void lineOfDuty() {
		System.out.println(name + "公司财务收支管理！");
	}
}
