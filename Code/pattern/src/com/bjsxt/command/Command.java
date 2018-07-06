package com.bjsxt.command;

public interface Command {

	/**
	 * ���������һ�����ؽ��Ϊ�յķ���
	 * ʵ����Ŀ�У����Ը���������ƶ����ͬ�ķ���
	 */
	void execute();
}

class ConcreteCommand implements Command {

	private Receiver receiver;	//����������ִ����
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		//����ִ��ǰ��ִ����ش���
		receiver.action();
	}
	
}