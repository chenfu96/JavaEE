package com.bjsxt.Mediator;

public class Finacail implements Department {

	private Mediator m; //持有中介者（总经理）的引用
	
	public Finacail(Mediator m) {
		super();
		this.m = m;
		m.register("finacail", this);
	}
	@Override
	public void slefAction() {
		System.out.println("数钱");
	}
	@Override
	public void outAction() {
		System.out.println("汇报工作，没钱了！");
	}
}
