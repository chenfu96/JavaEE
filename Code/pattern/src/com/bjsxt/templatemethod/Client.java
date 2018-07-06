package com.bjsxt.templatemethod;

public class Client {

	public static void main(String[] args) {
		DrawMoney btm = new DrawMoney();
		
		btm.process();
		
		//���������ڲ���
		BankTemplateMehtod btm2 = new BankTemplateMehtod() {
			
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ��");
			}
		};
		btm2.process();
	}
}

class DrawMoney extends BankTemplateMehtod {

	@Override
	public void transact() {
		System.out.println("��Ҫȡ���");
	}	
}
