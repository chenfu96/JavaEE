package com.nchu.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> chidren = new ArrayList<>();
	public ConcreteCompany(String name) {
		super(name);
	}

	public void add(Company company) {
		chidren.add(company);
	}

	public void remove(Company company) {
		chidren.remove(company);
	}

	public void display(int depth) {
		System.out.println(new String(name + depth));
		for(Company company : chidren){
			company.display(depth + 2);
		}
	}

	//ÂÄÐÐÖ°Ôð
	public void lineOfDuty() {
		for(Company company : chidren){
			company.lineOfDuty();
		}
	}
}
