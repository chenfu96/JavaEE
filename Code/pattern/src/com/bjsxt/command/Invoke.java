package com.bjsxt.command;

//����ĵ����ߺͷ�����
public class Invoke {

	private Command command; //Ҳ����ͨ������List<Command>�������󣬽������������ݿ�ײ���������������ƵĽṹ��

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	//ҵ�񷽷������ڵ���������ķ���
	public void call(){
		command.execute();
	}
	
	
}
