package com.bjsxt.observer;

public abstract class Subject {
	private String action;
	public abstract void attach(Observe observe);
	public abstract void detach(Observe observe);
	public abstract void notifyOfSubject();
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
