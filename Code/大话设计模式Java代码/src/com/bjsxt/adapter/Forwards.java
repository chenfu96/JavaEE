package com.bjsxt.adapter;

public class Forwards extends Player {


	
	public Forwards(String name) {
		super(name);
	}

	public void attack() {
		System.out.println("ǰ��" + name + "������");
	}

	public void defense() {
		System.out.println("ǰ��" + name + "���أ�");
	}
}
