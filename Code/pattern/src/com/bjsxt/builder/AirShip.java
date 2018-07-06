package com.bjsxt.builder;

/**
 * ÓîÖæ·É´¬
 * @author Administrator
 *
 */
public class AirShip {

	private ObitalModule obitalModule;//¹ìµÀ²Õ
	private Engine engine;//·¢¶¯»ú
	private EscapeTower escapeTower;//ÌÓÒÝËþ
	
	
	public void launch(){
		System.out.println("·¢Éä£¬µã»ð");
	}
	
	
	public ObitalModule getObitalModule() {
		return obitalModule;
	}
	public void setOrbitalModule(ObitalModule obitalModule) {
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
