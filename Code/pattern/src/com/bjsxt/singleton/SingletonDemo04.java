package com.bjsxt.singleton;

/**
 * 测试静态内部类实现单例模式
 * 这种方法：线程安全，调用效率高，可以延时加载
 * @author Administrator
 *
 */
public class SingletonDemo04 {

	private static class SingletonClassInstance{
		private static final SingletonDemo04 instance = new SingletonDemo04();
	}
	
	//线程不同步
	public static SingletonDemo04 getInstance (){
		System.out.println("aa");
		return SingletonClassInstance.instance;
	}
	
	private SingletonDemo04(){
		
	}
}
