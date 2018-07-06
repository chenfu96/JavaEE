package com.nchu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu {

	private List<MenuItem> menuItems = new ArrayList<>();
	
	public void addMenuItem(MenuItem menuItem){
		menuItems.add(menuItem);
	}
	
	public void remove(MenuItem menuItem){
		menuItems.remove(menuItem);
	}
	
	public Iterator<MenuItem> createIterator() {  
        return menuItems.iterator();  
    }  
}
