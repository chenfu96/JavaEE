package com.bjsxt.actory;

public class Agent {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.createOperation();
		operation.numberA = 1;
		operation.numberB = 2;
		double reseult = operation.operation();
		System.out.println(reseult);
	}
}
