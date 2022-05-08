package com.arup.dp.structuralDesignPatterns.facadeDesignPattern;

public class Car implements Vehicle{

	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning the car interiour");
	}

}
