package com.bjsxt.factory.abstractFactory;

import javax.xml.parsers.FactoryConfigurationError;

public class Client {

	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
	}
}
