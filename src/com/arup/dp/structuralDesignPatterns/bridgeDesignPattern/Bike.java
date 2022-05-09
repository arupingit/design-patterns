package com.arup.dp.structuralDesignPatterns.bridgeDesignPattern;

public class Bike extends Vehicle {
	
	Bike(Workshop w1, Workshop w2){
		super(w1, w2);
	}

	@Override
	void getManufacturer() {
		System.out.print("Bike is");
		super.workshop1.work();
		super.workshop2.work();
		System.out.println("");
	}

}
