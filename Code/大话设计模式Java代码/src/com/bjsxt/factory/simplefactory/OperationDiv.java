package com.bjsxt.factory.simplefactory;

public class OperationDiv extends Operation {

	public double GetResult() {
		if(numberB == 0)
			throw new RuntimeException("��������Ϊ0��");
		result = numberA / numberB;
		return result;
	}
}
