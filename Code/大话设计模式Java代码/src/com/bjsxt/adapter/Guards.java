package com.bjsxt.adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	public void attack() {
		System.out.println("ÖĞ·æ" + name + "½ø¹¥£¡");
	}

	public void defense() {
		System.out.println("ÖĞ·æ" + name + "·ÀÊØ£¡");
	}
}
