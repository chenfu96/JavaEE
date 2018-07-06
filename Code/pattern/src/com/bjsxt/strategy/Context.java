package com.bjsxt.strategy;

/**
 * ����;�������ཻ��
 * �����Ļ��������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˱仯��
 * ����ʹ��Spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ�Ĳ��Զ��󣬶�̬�л���ͬ�÷�
 * @author Administrator
 *
 */
public class Context {
	private Strategy strategy; //��ǰ���õ��㷨

	//����ͨ��������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	
	//����ͨ��set������ע��
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void printPrice (double s) {
		System.out.println("��ı��ۣ�" +strategy.getPrice(s));
	}	
}