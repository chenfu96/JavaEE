package com.nchu.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("构建nchu发动机！");
		return new Engine("nchu发动机");
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
