package com.bjsxt.factory.simplefactory;

public class OperationDiv extends Operation {

	public double GetResult() {
		if(numberB == 0)
			throw new RuntimeException("除数不能为0！");
		result = numberA / numberB;
		return result;
	}
}
