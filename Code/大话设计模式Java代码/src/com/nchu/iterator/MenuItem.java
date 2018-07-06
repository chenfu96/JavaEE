package com.nchu.iterator;

public class MenuItem {

	private String foodName;
	
	public MenuItem(String foodName) {
		this.foodName = foodName;
	}

	@Override
	public String toString() {
		return this.foodName;
	}
	
	
}
