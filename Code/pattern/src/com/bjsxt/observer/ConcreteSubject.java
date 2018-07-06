package com.bjsxt.observer;

public class ConcreteSubject extends Subject {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//目标对象发生变化，通知所有的观察者更新对象
		this.notifyAllObservers();
	}
	
	
}
