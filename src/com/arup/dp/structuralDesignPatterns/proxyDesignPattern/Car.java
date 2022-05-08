package com.arup.dp.structuralDesignPatterns.proxyDesignPattern;

public abstract class Car implements Vehicle {

	@Override
	public void getColor() {
		System.out.println("Car is white color");
	}

}
