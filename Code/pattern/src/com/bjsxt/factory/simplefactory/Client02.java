package com.bjsxt.factory.simplefactory;

/**
 * 没有工厂模式下的情况下
 * @author Administrator
 *
 */
public class Client02 {

	public static void main(String[] args) {
		Car c1 = CarFactory.creatCar("比亚迪");
		c1.run();
	}
}
