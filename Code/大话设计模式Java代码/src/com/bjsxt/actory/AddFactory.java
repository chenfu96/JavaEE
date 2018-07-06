package com.bjsxt.actory;

public class AddFactory implements IFactory{

	public Operation createOperation() {
		return new OperationAdd();
	}

	

}
