package com.bjsxt.singleton;

/**
 * ˫�ؼ����ʵ��
 * �ص㣺���ģ�ͽ�ͬ�������·���if�ڲ������ִ��Ч�ʣ�����ÿ�λ�ȡ����ʱ������ͬ����
 * ֻ�е�һ�β�ͬ���������Ժ��û��Ҫ�ˡ�
 * 
 * ���⣺���ڱ�������JVM�ײ��ڲ�ģ�͵�ԭ��ż��������⡣������ʹ�á�
 * @author Administrator
 *
 */
public class SingletonDemo03 {

	private static SingletonDemo03 instance;
	
	public static SingletonDemo03 getInstance(){
		if(instance == null){
			SingletonDemo03 sc;
			synchronized (SingletonDemo03.class) {			
				sc = instance;
				if(sc == null){
					synchronized (SingletonDemo03.class) {
						if(sc == null){
							sc = new SingletonDemo03();
						}
					}
					instance = sc;
				}
				
			}
		}
		return instance;
	}
	
	private SingletonDemo03(){
		
	}
}
