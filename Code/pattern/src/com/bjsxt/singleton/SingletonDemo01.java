package com.bjsxt.singleton;


/**
 * 测试--饿汉式单例模式
 * @author Administrator
 *
 */
public class SingletonDemo01 {

	//天然线程安全
	public static SingletonDemo01 instance = new SingletonDemo01();//类初始化时，立即加载这个对象
	
	private SingletonDemo01(){	
	}
	//方法没有同步，调用效率高！
	public static SingletonDemo01 getInstance(){
		return instance;
	}
}
