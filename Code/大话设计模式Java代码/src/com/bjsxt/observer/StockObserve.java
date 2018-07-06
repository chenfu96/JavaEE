package com.bjsxt.observer;

public class StockObserve extends Observe {

	public StockObserve(String name, Subject subject) {
		super(name, subject);
	}

	public void update() {
		System.out.println(subject.getAction() + ", " + name + " 关闭股票行情!");
	}
	
}
