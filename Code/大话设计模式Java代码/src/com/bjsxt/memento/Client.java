package com.bjsxt.memento;

public class Client {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMento(c.getMemento());
		o.show();
	}
}
