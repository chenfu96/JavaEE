package com.chenfu.test;
/**
 * �����ڲ���(����ʹ��һ��)
 * 1.�̳�ʽ
 * 2.�ӿ�ʽ
 * 3.����ʽ
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
		//�����ڲ��࣬ͬʱҲ�Ƿ����ڲ��ࣨ�����ڷ������棩
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		//�����ڲ��࣬�̳�ʽ
		Car car = new Car(){
			@Override
			public void run() {
				System.out.println("���೵��");
			}
		};
		car.run();
		test02(new Car(){
			@Override
			public void run() {
				System.out.println("������ʽ����");
			}
		});
	}
	
}

class Car{
	public void run(){
		System.out.println("������");
	}
}


