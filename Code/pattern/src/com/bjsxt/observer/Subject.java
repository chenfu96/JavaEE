package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<Observer>();
	
	public void register(Observer obs) {
		list.add(obs);
	}
	
	public void removeOserver (Observer obs) {
		list.remove(obs);
	}
	
	//通知所有的观察者更新状态
	
	public void notifyAllObservers() {
		for(Observer obs : list) {
			obs.update(this);
		}
	}
}
