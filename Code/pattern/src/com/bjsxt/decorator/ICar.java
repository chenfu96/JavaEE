package com.bjsxt.decorator;

/**
 * �������
 * @author Administrator
 *
 */
public interface ICar {
	void move();
}
//ConcreteComponent���幹������
class Car implements ICar {

	@Override
	public void move() {
		System.out.println("½�����ܣ�");
	}
	
}


//Decoratorװ�ν�ɫ
class SuperCar implements ICar {

	protected ICar car;	
	public SuperCar(ICar car) {
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
	
	
}

//ConcreteDecorator����װ�ζ���
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);	
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	public void fly () {
		System.out.println("�����Ϸ�");
	}
	
}

//ConcreteDecorator����װ�ζ���
class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);	
	}
	@Override
	public void move() {
		super.move();
		swim();
	}
	public void swim () {
		System.out.println("ˮ����");
	}	
}

//ConcreteDecorator����װ�ζ���
class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);	
	}
	@Override
	public void move() {
		super.move();
		auto();
	}
	public void auto () {
		System.out.println("�Զ���");
	}	
}


