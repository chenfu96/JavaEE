package com.bjsxt.strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�����");
		return standardPrice * 0.8;
	}

}
