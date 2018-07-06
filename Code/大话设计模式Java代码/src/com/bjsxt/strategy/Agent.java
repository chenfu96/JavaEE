package com.bjsxt.strategy;

public class Agent {

	public static void main(String[] args) {
		Strategy strategy = new ConcreteStrategyA();
		Context context = new Context(strategy);
		context.contextInterface();
	}
}