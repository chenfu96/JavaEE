package com.bjsxt.state;

public class Context {

	//如果是银行系统，这个contex根据金额不同切换不同的状态！
	
	
	private State state;
	
	
	public void SetState(State state) {
		System.out.println("修改状态!");
		this.state = state;
		this.state.handle();
	}
}
