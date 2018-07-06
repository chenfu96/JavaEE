package com.bjsxt.observer;

public class Client {

	public static void main(String[] args) {
		Boss boss = new Boss();
		boss.setAction("boss");
		StockObserve stockObserve = new StockObserve("ÍþÍþ", boss);
		
		boss.attach(stockObserve);
		
		boss.notifyOfSubject();
	}
}
