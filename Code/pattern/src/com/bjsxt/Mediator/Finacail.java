package com.bjsxt.Mediator;

public class Finacail implements Department {

	private Mediator m; //�����н��ߣ��ܾ���������
	
	public Finacail(Mediator m) {
		super();
		this.m = m;
		m.register("finacail", this);
	}
	@Override
	public void slefAction() {
		System.out.println("��Ǯ");
	}
	@Override
	public void outAction() {
		System.out.println("�㱨������ûǮ�ˣ�");
	}
}
