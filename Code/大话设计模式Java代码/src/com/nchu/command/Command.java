package com.nchu.command;

abstract class Command {

	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public abstract void excuteCommand();
}
