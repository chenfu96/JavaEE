package com.chenfu.test;

import com.chenfu.test.Outer02.StaticInnerClass;

/**
 * 静态内部类基本用法
 * @author Administrator
 *
 */
public class Dem02{
	public static void main(String[] args) {
		
		Outer02.StaticInnerClass osic = new Outer02.StaticInnerClass();
		
//		StaticInnerClass osic = new StaticInnerClass();
	}
}

class Outer02 {

	int c = 5;
	static int d = 10;
	
	/*private*/ static class StaticInnerClass{
		
		int a = 3;
		static int  b = 5;
		public void test(){
			System.out.println(d);
//			System.out.println(c);//静态内部类中不能调用外部的普通成员，只能调用静态方法。
		}
		
	}
}