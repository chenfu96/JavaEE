package com.bjsxt.adapter;

/**
 * ������(����������ʽ��ʹ����ϸ����������)
 * ���൱��USB��PS/2��ת������
 * @author Administrator
 *
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	
}
