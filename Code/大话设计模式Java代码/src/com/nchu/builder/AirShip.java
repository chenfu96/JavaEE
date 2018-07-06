package com.nchu.builder;


public class AirShip {

	private ObitalModule obitalModule;//轨道舱
	private Engine engine;//发动机
	private EscapeTower escapeTower;//逃逸塔
	
	public void launch(){
		System.out.println("点火，发射！");
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
