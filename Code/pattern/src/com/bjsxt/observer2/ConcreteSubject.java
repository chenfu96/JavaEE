package com.bjsxt.observer2;

import java.util.Observable;

//目标对象
public class ConcreteSubject extends Observable {

	private int state;
	
	
	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public void set(int s) {
		state = s;//目标状态发生了改变
		
		setChanged(); //表示目标对象已做修改
		notifyObservers(state); //通知所有的观察者
	}
}
