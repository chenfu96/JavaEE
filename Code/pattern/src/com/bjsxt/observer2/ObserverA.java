package com.bjsxt.observer2;

import java.util.Observable;
import java.util.Observer;


public class ObserverA implements Observer {

	private int state;
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.state  = ((ConcreteSubject)o).getState();
	}
}
