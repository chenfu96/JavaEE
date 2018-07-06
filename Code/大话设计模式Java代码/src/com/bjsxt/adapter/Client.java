package com.bjsxt.adapter;

public class Client {

	public static void main(String[] args) {
		
		Player b = new Forwards("°ÍµÙ¶û");
		b.attack();
		
		Player m = new Guards("Âó¿Ë¸ñÀ×µÏ");
		m.attack();
		
		Player ym = new Translator("Ò¦Ã÷");
		ym.attack();
		ym.defense();
	}
}
