package com.bjsxt.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyTo implements InvocationHandler {

	RealSubject realSubject = null;

	public ProxyTo(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object = null;
		System.out.println("ÕæÕýÖ´ÐÐ");
		if(method.getName().equals("request")){
			object = method.invoke(realSubject, args);
		}
		return object;
	}
}
