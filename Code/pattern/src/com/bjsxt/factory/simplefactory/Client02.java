package com.bjsxt.factory.simplefactory;

/**
 * û�й���ģʽ�µ������
 * @author Administrator
 *
 */
public class Client02 {

	public static void main(String[] args) {
		Car c1 = CarFactory.creatCar("���ǵ�");
		c1.run();
	}
}
