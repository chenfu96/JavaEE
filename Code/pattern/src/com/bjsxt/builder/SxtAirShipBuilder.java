package com.bjsxt.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	 //StringBuilder 以后学XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建尚学堂发动机！");
		return new Engine("尚学堂发动机");
	}

	@Override
	public ObitalModule builderObitalModule() {
		System.out.println("构建轨道舱");
		return new ObitalModule("构建轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("构建逃逸塔");
	}

}
