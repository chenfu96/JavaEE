package com.chenfu.test;

import java.util.Date;

/**
 * ��Ա�ڲ���
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
	
	
	//��Ա�ڲ���(�ڲ������ʹ���ⲿ��ĳ�Ա��ֻ���ⲿ��ʹ�ã��������ڲ���Ҫ������ʹ�ã�ֱ�Ӷ���Ϊ��ͨ��)
	/*private */class InnerClass{
		
//		static int d = 88;//��Ա�ڲ��಻���о�̬��Ա
		final static int d = 88;//��������Ϊfinal
//		final static Date d2 = new Date();//����ֻ���Ǳ���������ȷ��ֵ�ĳ������ʽ��
		
		void test(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(e);
			
			System.out.println("�ڲ���"+this);//��Ա�ڲ������Ĵ��������������ⲿ�����
			System.out.println("�ⲿ�ࣺ"+Outer03.this);//�������ⲿ��Ķ���
		}
	}
	
}

