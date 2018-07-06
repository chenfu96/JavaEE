package com.bjsxt.adapter;

/**
 * 适配器(类适配器方式，使用组合跟被适配对象)
 * （相当于USB和PS/2的转换器）
 * @author Administrator
 *
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	
}
