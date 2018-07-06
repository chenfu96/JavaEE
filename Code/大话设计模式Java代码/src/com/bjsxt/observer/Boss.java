package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {

	private List<Observe> observers = new ArrayList<Observe>();

	public void attach(Observe observe) {
		observers.add(observe);
	}

	public void detach(Observe observe) {
		observers.remove(observe);
	}

	public void notifyOfSubject() {
		for(Observe observe : observers){
			observe.update();
		}
	}
}
