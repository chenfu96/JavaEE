package com.bjsxt.actory;

abstract class Operation {

	protected double numberA;
	protected double numberB;
	
	public Operation(double numberA, double numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public Operation() {
	}


	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public abstract double operation();
}
