package com.chenfu.test;
/**
 * 方法内部类
 * @author Administrator
 *
 */
public class Demo04 {
	
}

class Outer04{
	
	public void test(){
		
		/*final*/ int a = 3;
		class Inner{
			int b = 10;
//			static int c = 20;//方法内部类中只能定义非静态成员。
			final static  int c = 20;
			void tt(){
//				System.out.println(a);//JDK8中不加final也可以访问，但是在之前JDK1.7则不行
				//方法的生命周期和方法内部类对象的生命周期不一致,方法执行完，内部类对象可能仍然存在
				
				System.out.println(b);
			}
		}
	}
}