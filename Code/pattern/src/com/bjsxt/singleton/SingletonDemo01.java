package com.bjsxt.singleton;


/**
 * ����--����ʽ����ģʽ
 * @author Administrator
 *
 */
public class SingletonDemo01 {

	//��Ȼ�̰߳�ȫ
	public static SingletonDemo01 instance = new SingletonDemo01();//���ʼ��ʱ�����������������
	
	private SingletonDemo01(){	
	}
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo01 getInstance(){
		return instance;
	}
}
