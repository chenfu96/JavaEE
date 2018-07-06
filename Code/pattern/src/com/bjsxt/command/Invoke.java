package com.bjsxt.command;

//命令的调用者和发起者
public class Invoke {

	private Command command; //也可以通过容器List<Command>容器对象，进行批处理，数据库底层的事物管理就是类似的结构！

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	//业务方法，用于调用命令类的方法
	public void call(){
		command.execute();
	}
	
	
}
