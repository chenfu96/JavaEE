package com.bjsxt.singleton;

/**
 * ���Ծ�̬�ڲ���ʵ�ֵ���ģʽ
 * ���ַ������̰߳�ȫ������Ч�ʸߣ�������ʱ����
 * @author Administrator
 *
 */
public class SingletonDemo04 {

	private static class SingletonClassInstance{
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}
	
	//�̲߳�ͬ��
	public static SingletonDemo04 getInstance (){
		System.out.println("aa");
		return SingletonClassInstance.instance;
	}
	
	private SingletonDemo04(){
		
	}
}
