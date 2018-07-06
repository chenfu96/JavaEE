package com.bjsxt.actory;

public class MulFactory implements IFactory {

	public Operation createOperation() {
		return new OperationMul();
	}
}
