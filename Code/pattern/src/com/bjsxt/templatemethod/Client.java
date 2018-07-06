package com.bjsxt.templatemethod;

public class Client {

	public static void main(String[] args) {
		DrawMoney btm = new DrawMoney();
		
		btm.process();
		
		//采用匿名内部类
		BankTemplateMehtod btm2 = new BankTemplateMehtod() {
			
			@Override
			public void transact() {
				System.out.println("我要存钱！");
			}
		};
		btm2.process();
	}
}

class DrawMoney extends BankTemplateMehtod {

	@Override
	public void transact() {
		System.out.println("我要取款！！");
	}	
}
