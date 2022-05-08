package com.arup.dp.creationalDesignPatterns.factoryDesignPattern;

public class Bike implements Vehicle {

	@Override
	public String getEngine() {
		return "500cc";
	}

	@Override
	public int getNumberOfWheels() {
		return 2;
	}

}
