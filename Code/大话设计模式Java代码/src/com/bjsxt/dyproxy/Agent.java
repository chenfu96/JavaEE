package com.bjsxt.dyproxy;

import java.lang.reflect.Proxy;

public class Agent {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		ProxyTo proxyTo = new ProxyTo(realSubject);
		Subject proxy = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, proxyTo);
		proxy.request();
	}
}
