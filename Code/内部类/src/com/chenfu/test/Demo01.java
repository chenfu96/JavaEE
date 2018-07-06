package com.chenfu.test;
/**
 * 测试内部类
 * @author Administrator
 *
 */
public class Demo01 {
	
	//静态内部类
	private static class StaticNestedClass{
		
	}
	
	//成员内部类（成员内部类）
	private class FieldInnerClass{
		
	}
	
	void sayHello(){
		
		//方法内部类（局部内部类）
		class LocalCalss{
			
		}
		
		Runnable runnable = new Runnable() {//两个作用：定义了匿名内部类的类体；创建了匿名内部类的一个实体。
			@Override
			public void run() {
				
			}
		};
	}
	
	//匿名内部类
	
}
