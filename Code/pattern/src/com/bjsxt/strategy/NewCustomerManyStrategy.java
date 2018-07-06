package com.bjsxt.strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("´ò¾ÅÕÛ£¡");
		return standardPrice * 0.9;
	}

}
