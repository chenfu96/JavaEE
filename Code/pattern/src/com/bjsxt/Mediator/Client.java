package com.bjsxt.Mediator;

public class Client {
	
	public static void main(String[] args) {
		Mediator m = new president();
		
		Market market = new Market(m);
		Department devp = new Development(m);
		Finacail f =new Finacail(m);
		
		market.slefAction();
		market.outAction();
	}
}
