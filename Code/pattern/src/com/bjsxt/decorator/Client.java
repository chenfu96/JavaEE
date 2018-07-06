package com.bjsxt.decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("********************�����µĹ���*******************");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		System.out.println("********************�����µĹ���*******************");
		WaterCar watercar = new WaterCar(car);
		watercar.move();
	}
}
