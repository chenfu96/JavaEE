package com.bjsxt.strategy;

/**
 * 负责和具体策略类交互
 * 这样的话，具体算法和直接的客户端调用分离了，使得算法可以独立于客户端变化。
 * 可以使用Spring的依赖注入功能，还可以通过配置文件，动态的注入不同的策略对象，动态切换不同用法
 * @author Administrator
 *
 */
public class Context {
	private Strategy strategy; //当前采用的算法

	//可以通过构造器注入
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	
	//可以通过set方法来注入
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void printPrice (double s) {
		System.out.println("你的报价：" +strategy.getPrice(s));
	}	
}
