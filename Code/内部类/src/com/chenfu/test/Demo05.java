package com.chenfu.test;
/**
 * 匿名内部类(仅限使用一次)
 * 1.继承式
 * 2.接口式
 * 3.参数式
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		Outer05 outer =new Outer05();
		outer.test();
	}
}

class Outer05{
	
	public void test02(Car c){
		c.run();
	}
	
	public void test(){
		//匿名内部类，同时也是方法内部类（定义在方法里面）
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		//匿名内部类，继承式
		Car car = new Car(){
			@Override
			public void run() {
				System.out.println("子类车跑");
			}
		};
		car.run();
		test02(new Car(){
			@Override
			public void run() {
				System.out.println("参数样式再跑");
			}
		});
	}
	
}

class Car{
	public void run(){
		System.out.println("汽车跑");
	}
}


