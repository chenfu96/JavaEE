package com.bjsxt.decorator;

public class ConcreteDecoratorA extends Decorator {

	private String addState;
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addState = "New State";
		System.out.println("具体装饰对象A的操作");
	}
	
}
