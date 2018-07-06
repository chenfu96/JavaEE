package com.bjsxt.factory.simplefactory;
/**
 * 简单工厂，对于此处的switch语句可以用反射来处理
 * @author acer
 *
 */
public class OperationFactory {

	public static Operation createOperation(String operate){
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
}
