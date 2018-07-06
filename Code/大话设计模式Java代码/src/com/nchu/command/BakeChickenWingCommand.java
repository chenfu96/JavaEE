package com.nchu.command;

public class BakeChickenWingCommand extends Command {

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}
}
