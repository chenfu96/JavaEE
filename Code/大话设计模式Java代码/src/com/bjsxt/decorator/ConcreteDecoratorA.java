package com.bjsxt.decorator;

public class ConcreteDecoratorA extends Decorator {

	private String addState;
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addState = "New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}
	
}
