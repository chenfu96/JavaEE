package com.bjsxt.Mediator;

public class Market implements Department {

	private Mediator m; //持有中介者（总经理）的引用
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}
	@Override
	public void slefAction() {
		System.out.println("跑去接项目");
	}
	@Override
	public void outAction() {
		System.out.println("汇报工作，项目承接的进度需要资金！");
		m.command("finacail");
	}
}
