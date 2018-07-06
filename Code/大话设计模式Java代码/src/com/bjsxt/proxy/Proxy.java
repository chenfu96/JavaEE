package com.bjsxt.proxy;

public class Proxy extends Subject {

	RealSubject realSubject = null;
	
	public void request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}
