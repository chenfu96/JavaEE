package com.bjsxt.adapter;

public class Client {

	public static void main(String[] args) {
		
		Player b = new Forwards("�͵ٶ�");
		b.attack();
		
		Player m = new Guards("��˸��׵�");
		m.attack();
		
		Player ym = new Translator("Ҧ��");
		ym.attack();
		ym.defense();
	}
}
