package com.bjsxt.singleton;

/**
 * ����--����ʽ����ģʽ
 * @author Administrator
 *
 */
public class SingletonDemo02 {

	//�����ʱ������ʼ�����������ʱ���أ������õ�ʱ���ټ��أ�
	public static SingletonDemo02 instance;//���ʼ��ʱ�����������������
	
	//˽�й�����
	private SingletonDemo02(){	
	}
		//����ͬ��������Ч�ʵͣ�
	public static  synchronized SingletonDemo02 getInstance(){
		if(instance == null){
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
