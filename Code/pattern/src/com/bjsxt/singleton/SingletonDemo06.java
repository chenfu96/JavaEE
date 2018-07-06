package com.bjsxt.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

import javax.management.RuntimeErrorException;

/**
 * ����--����ʽ����ģʽ����η�ֹ����ͷ����л�©����
 * @author Administrator
 *
 */
public class SingletonDemo06 implements Serializable {

	//�����ʱ������ʼ�����������ʱ���أ������õ�ʱ���ټ��أ�
	public static SingletonDemo06 instance;//���ʼ��ʱ�����������������
	
	//˽�й�����
	private SingletonDemo06(){	
		if(instance != null){
			throw new RuntimeException();
		}
	}
		//����ͬ��������Ч�ʵͣ�
	public static  synchronized SingletonDemo06 getInstance(){
		if(instance == null){
			instance = new SingletonDemo06();
		}
		return instance;
	}
	
	//������ʱ�����������readResolve������ֱ�ӷ��ش˷���ָ���Ķ��󣬶�����Ҫ������������
	//��������http://blog.csdn.net/huangbiao86/article/details/6896565
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
