package com.bjsxt.command;

public interface Command {

	/**
	 * 这个方法是一个返回结果为空的方法
	 * 实际项目中，可以根据需求设计多个不同的方法
	 */
	void execute();
}

class ConcreteCommand implements Command {

	private Receiver receiver;	//命令真正的执行者
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		//命令执行前，执行相关处理！
		receiver.action();
	}
	
}