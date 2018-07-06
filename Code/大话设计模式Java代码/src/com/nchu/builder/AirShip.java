package com.nchu.builder;


public class AirShip {

	private ObitalModule obitalModule;//�����
	private Engine engine;//������
	private EscapeTower escapeTower;//������
	
	public void launch(){
		System.out.println("��𣬷��䣡");
	}

	public ObitalModule getObitalModule() {
		return obitalModule;
	}

	public void setObitalModule(ObitalModule obitalModule) {
		this.obitalModule = obitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
}

class ObitalModule{
	private String name;

	public ObitalModule(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Engine{
	private String name;

	public Engine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class EscapeTower{
	private String name;

	public EscapeTower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
