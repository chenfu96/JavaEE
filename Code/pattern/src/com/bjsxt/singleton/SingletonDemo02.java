package com.bjsxt.singleton;

/**
 * 测试--懒汉式单例模式
 * @author Administrator
 *
 */
public class SingletonDemo02 {

	//类加载时，不初始化这个对象（延时加载，真正用的时候再加载）
	public static SingletonDemo02 instance;//类初始化时，立即加载这个对象
	
	//私有构造器
	private SingletonDemo02(){	
	}
		//方法同步，调用效率低！
	public static  synchronized SingletonDemo02 getInstance(){
		if(instance == null){
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
