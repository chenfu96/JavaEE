package com.bjsxt.adapter;

abstract class Player {

	protected String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract void attack();
	public abstract void defense();
}
