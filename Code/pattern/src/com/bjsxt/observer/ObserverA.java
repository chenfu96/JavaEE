package com.bjsxt.observer;

public class ObserverA implements Observer {

	private int myState; //mystate需要跟目标对象state保持一致
	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}	
}
