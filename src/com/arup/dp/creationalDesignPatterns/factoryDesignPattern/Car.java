package com.arup.dp.creationalDesignPatterns.factoryDesignPattern;

public class Car implements Vehicle {

	@Override
	public String getEngine() {
		return "1800cc";
	}

	@Override
	public int getNumberOfWheels() {
		return 4;
	}

}
