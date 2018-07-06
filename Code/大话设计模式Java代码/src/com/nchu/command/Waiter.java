package com.nchu.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Command> orders = new ArrayList<>();
	
	public void setOrder(Command command){
		orders.add(command);
		System.out.println("���Ӷ����� " + command.toString() + " ʱ�䣺" + System.currentTimeMillis());
	}
	
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("ȡ�������� " + command.toString() + " ʱ�䣺" + System.currentTimeMillis());
	}
	
	public void Notify(){
		for(Command cmd : orders){
			cmd.excuteCommand();
		}
	}
}
