package com.chenfu.test;
/**
 * �����ڲ���
 * @author Administrator
 *
 */
public class Demo01 {
	
	//��̬�ڲ���
	private static class StaticNestedClass{
		
	}
	
	//��Ա�ڲ��ࣨ��Ա�ڲ��ࣩ
	private class FieldInnerClass{
		
	}
	
	void sayHello(){
		
		//�����ڲ��ࣨ�ֲ��ڲ��ࣩ
		class LocalCalss{
			
		}
		
		Runnable runnable = new Runnable() {//�������ã������������ڲ�������壻�����������ڲ����һ��ʵ�塣
			@Override
			public void run() {
				
			}
		};
	}
	
	//�����ڲ���
	
}
