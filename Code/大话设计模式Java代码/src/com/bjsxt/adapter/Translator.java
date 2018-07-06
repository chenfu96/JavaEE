package com.bjsxt.adapter;

public class Translator extends Player {

	private ForeignCenter wjzf = new ForeignCenter();
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}

	public void attack() {
		wjzf.½ø¹¥();
	}

	public void defense() {
		wjzf.½ø¹¥();
	}
}
