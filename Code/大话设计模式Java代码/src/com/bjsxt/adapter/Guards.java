package com.bjsxt.adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	public void attack() {
		System.out.println("�з�" + name + "������");
	}

	public void defense() {
		System.out.println("�з�" + name + "���أ�");
	}
}
