package com.bjsxt.observer;

public class Client {

	public static void main(String[] args) {
		
		//����Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		
		
		//��������۲���
		
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();

		//���������۲�����ӵ�suject������
		
		subject.register(obs1);
		subject.register(obs2);
		subject.register(obs3);
		//�ı�״̬ǰ
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//���ڸı�subject״̬
		
		subject.setState(200);
		/**
		 * ��̬==��󶨡�

		����	��Ҫ�Ѻ����������Ϊ��̬��
		
		����	��Ϊ��̬��һ�������ڵ���Ϊ�����Ǳ����ڵ���Ϊ��
		
		����	��̬�������͵����ÿ���ָ�������͵Ķ���
		
		����	���� Parent p = new Child();
		
		����	��ʹ�ö�̬��ʽ���÷���ʱ�����ȼ�鸸�����Ƿ��и÷��������û�У���������
	
	��������	����У���ȥ��������ĸ�ͬ��������
	
			��ע��˴�����̬static�������������������̬����ֻ�ܼ̳У�������дOverride����������ж�����ͬ��ͬ��ʽ�ľ�̬���������Ը��෽��ֻ�����ص����á����õ�ʱ����˭�����ã������˭�İ汾����

����			���ο�ѧϰ���ӣ�http://docs.oracle.com/javase/tutorial/java/IandI/override.html������

����			�����Ҫ�����������ж�������û�еķ�������Ҫ����ǿ������ת����������������У���pת��Ϊ����Child���͵����á�

����			��Ϊ���ø��������ָ������Ķ����ø������õ��÷���ʱ���Ҳ��������в����ڵķ�������ʱ����Ҫ�������µ�����ת��������������ת��Ϊ�������á� 
		 */
		//�۲��ߵ�״̬�ǲ��Ƿ����ı�
//		Observer obs1 = new ObserverA();
//		System.out.println(((ObserverA)obs1).getMyState());
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
