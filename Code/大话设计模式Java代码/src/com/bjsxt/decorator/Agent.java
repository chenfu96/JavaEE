package com.bjsxt.decorator;

public class Agent {

	public static void main(String[] args) {
		ConcreteComponent concreteComponent = new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
		concreteDecoratorB.operation();
	}
}
