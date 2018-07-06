package com.chenfu.test;

import java.util.Date;

/**
 * 成员内部类
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
//		InnerClass ic = new InnerClass();
		 Outer03 out = new Outer03();
		Outer03.InnerClass ic = out.new InnerClass();
		
		ic.test();
		out.tt();
	}
}
class Outer03{
	
	static int e = 2;
	private int a = 3;
	int  b = 10;
	
	public void tt(){
		InnerClass ic = new InnerClass();
		ic.test();
	}
	
	
	//成员内部类(内部类可以使用外部类的成员，只供外部类使用，如果这个内部类要被多类使用，直接定义为普通类)
	/*private */class InnerClass{
		
//		static int d = 88;//成员内部类不能有静态成员
		final static int d = 88;//除非声明为final
//		final static Date d2 = new Date();//并且只能是编译器可以确定值的常量表达式。
		
		void test(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(e);
			
			System.out.println("内部类"+this);//成员内部类对象的创建，必须先有外部类对象。
			System.out.println("外部类："+Outer03.this);//引用了外部类的对象
		}
	}
	
}

