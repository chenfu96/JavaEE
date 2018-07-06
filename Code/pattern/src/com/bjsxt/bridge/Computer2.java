package com.bjsxt.bridge;

/**
 * 电脑类型的维度
 * @author Administrator
 *
 */
public class Computer2 {

	private Brand brand;

	public Computer2(Brand brand) {
		this.brand = brand;
	}
	
	public void sale(){
		brand.sale();
	}
}

class Desktop2 extends Computer2 {

	public Desktop2(Brand b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}

class Laptop2 extends Computer2 {

	public Laptop2(Brand b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}
