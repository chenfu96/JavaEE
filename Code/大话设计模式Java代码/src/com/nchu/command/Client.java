package com.nchu.command;

public class Client {

	public static void main(String[] args) {
		
		//开店前准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommandA =  new BakeMuttonCommand(boy);
		Command bakeMuttonCommandB =  new BakeMuttonCommand(boy);
		Command bakeMuttonCommandC =  new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
	
		//开门营业 顾客点餐
		girl.setOrder(bakeMuttonCommandA);
		girl.setOrder(bakeMuttonCommandB);
		girl.setOrder(bakeMuttonCommandC);
		
		//点菜完毕
		girl.Notify();
	}
}
