package com.bjsxt.builder;

public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;
	
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		
		Engine e = builder.builderEngine();
		ObitalModule o = builder.builderObitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//≈‰÷√∑…––∆˜
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
