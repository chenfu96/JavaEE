package com.bjsxt.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�����ۣ�ԭ�ۣ�");
		return standardPrice;
	}

}
