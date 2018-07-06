package com.bjsxt.Mediator;

public class Market implements Department {

	private Mediator m; //�����н��ߣ��ܾ���������
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}
	@Override
	public void slefAction() {
		System.out.println("��ȥ����Ŀ");
	}
	@Override
	public void outAction() {
		System.out.println("�㱨��������Ŀ�нӵĽ�����Ҫ�ʽ�");
		m.command("finacail");
	}
}
