package com.bjsxt.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	 //StringBuilder �Ժ�ѧXML�����У�JDOM���е��ࣺDomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("������ѧ�÷�������");
		return new Engine("��ѧ�÷�����");
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
