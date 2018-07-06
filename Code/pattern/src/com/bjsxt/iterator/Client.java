package com.bjsxt.iterator;

public class Client {

	public static void main(String[] args) {
		ConcreteMyAggregate cam = new ConcreteMyAggregate();
		cam.addObject("aa");
		cam.addObject("bb");
		cam.addObject("cc");
		
		MyIterator iter = cam.createIterator();
		while(iter.hasNext()){
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}
}
