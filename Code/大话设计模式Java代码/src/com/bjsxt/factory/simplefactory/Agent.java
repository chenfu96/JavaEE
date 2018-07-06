package com.bjsxt.factory.simplefactory;


public class Agent {

	public static void main(String[] args) {
		 Operation oper = OperationFactory.createOperation("+");
		 oper.numberA = 1;
		 oper.numberB = 2;
		 double result = oper.GetResult();
		 System.out.println(result);
		 
	}
}
