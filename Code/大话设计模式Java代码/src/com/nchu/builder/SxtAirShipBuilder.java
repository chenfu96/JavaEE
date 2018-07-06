package com.nchu.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("����nchu��������");
		return new Engine("nchu������");
	}

	@Override
	public ObitalModule builderObitalModule() {
		System.out.println("���������");
		return new ObitalModule("���������");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("����������");
	}

}
