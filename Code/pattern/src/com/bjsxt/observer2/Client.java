package com.bjsxt.observer2;

public class Client {

	public static void main(String[] args) {
		//����Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		
		//�����۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//�����������۲������ӵ�Ŀ�����subject�Ĺ۲���������
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		//�޸�״̬
		subject.set(3000);
		System.out.println(obs1.getState());
		System.out.println(obs2.getState());
		System.out.println(obs3.getState());
		
		//�ٸ�һ��
		subject.set(600);
		System.out.println(obs1.getState());
		System.out.println(obs2.getState());
		System.out.println(obs3.getState());
	}
}
