package com.nchu.command;

public class Client {

	public static void main(String[] args) {
		
		//����ǰ׼��
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommandA =  new BakeMuttonCommand(boy);
		Command bakeMuttonCommandB =  new BakeMuttonCommand(boy);
		Command bakeMuttonCommandC =  new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
	
		//����Ӫҵ �˿͵��
		girl.setOrder(bakeMuttonCommandA);
		girl.setOrder(bakeMuttonCommandB);
		girl.setOrder(bakeMuttonCommandC);
		
		//������
		girl.Notify();
	}
}
