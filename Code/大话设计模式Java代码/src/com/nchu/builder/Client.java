package com.nchu.builder;

public class Client {

	public static void main(String[] args) {
		AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
	
		AirShip ship = director.directAirShip();
		
		System.out.print(ship.getEngine().getName());
		ship.launch();
	}
}
