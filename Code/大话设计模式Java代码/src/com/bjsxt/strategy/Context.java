package com.bjsxt.strategy;

public class Context {

	Strategy strategy = null;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void contextInterface(){
		strategy.algorithmInterface();
	}
}
