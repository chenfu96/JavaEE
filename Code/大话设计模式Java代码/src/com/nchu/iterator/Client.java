package com.nchu.iterator;

public class Client {

	public static void main(String[] args) {
		BreakfastMenu bm = new BreakfastMenu();
		bm.addMenuItem(new MenuItem("a"));
		bm.addMenuItem(new MenuItem("b"));
		bm.addMenuItem(new MenuItem("c"));
		
		LuchMenu lm = new LuchMenu();
		lm.addMenuItem(new MenuItem("d"));
		lm.addMenuItem(new MenuItem("e"));
		lm.addMenuItem(new MenuItem("f"));
		
//		Waitress wa = new Waitress(bm);
		Waitress wa = new Waitress(lm);
		
		wa.printMenu();
	}
}
