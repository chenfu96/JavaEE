package com.bjsxt.decorator;

public class ConcreteDecoratorB extends Decorator {

	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void addBehavior(){
		
	}
	
}
