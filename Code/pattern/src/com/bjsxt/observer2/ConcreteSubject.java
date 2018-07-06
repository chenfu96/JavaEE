package com.bjsxt.observer2;

import java.util.Observable;

//Ŀ�����
public class ConcreteSubject extends Observable {

	private int state;
	
	
	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public void set(int s) {
		state = s;//Ŀ��״̬�����˸ı�
		
		setChanged(); //��ʾĿ����������޸�
		notifyObservers(state); //֪ͨ���еĹ۲���
	}
}
