package com.bjsxt.state;

public class Context {

	//���������ϵͳ�����contex���ݽ�ͬ�л���ͬ��״̬��
	
	
	private State state;
	
	
	public void SetState(State state) {
		System.out.println("�޸�״̬!");
		this.state = state;
		this.state.handle();
	}
}
