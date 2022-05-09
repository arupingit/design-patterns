package com.arup.dp.structuralDesignPatterns.bridgeDesignPattern;

public class Car extends Vehicle {

	Car(Workshop w1, Workshop w2){
		super(w1,w2);
	}
	
	@Override
	void getManufacturer() {
		System.out.print("Car is");
		super.workshop1.work();
		super.workshop2.work();
		System.out.println("");
	}

}
