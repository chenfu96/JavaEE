package com.bjsxt.decorator;

public class ConcreteDecoratorB extends Decorator {

	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}

	private void addBehavior(){
		
	}
	
}
