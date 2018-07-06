package com.bjsxt.adapter;

public class Forwards extends Player {


	
	public Forwards(String name) {
		super(name);
	}

	public void attack() {
		System.out.println("Ç°·æ" + name + "½ø¹¥£¡");
	}

	public void defense() {
		System.out.println("Ç°·æ" + name + "·ÀÊØ£¡");
	}
}
