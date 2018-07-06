package com.bjsxt.decorator;

/**
 * 抽象组件
 * @author Administrator
 *
 */
public interface ICar {
	void move();
}
//ConcreteComponent具体构建对象
class Car implements ICar {

	@Override
	public void move() {
		System.out.println("陆地上跑！");
	}
	
}


//Decorator装饰角色
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

//ConcreteDecorator具体装饰对象
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
		System.out.println("在天上飞");
	}
	
}

//ConcreteDecorator具体装饰对象
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
		System.out.println("水里游");
	}	
}

//ConcreteDecorator具体装饰对象
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
		System.out.println("自动跑");
	}	
}


