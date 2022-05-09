package com.arup.dp.structuralDesignPatterns.bridgeDesignPattern;

public class BridgeDpRunner {

	public static void main(String[] args) {
		Workshop assembled = new Assembled();
		Workshop producer = new Producer();
		Vehicle car = new Car(producer, assembled);
		Vehicle bike = new Bike(producer, assembled);
		car.getManufacturer();
		bike.getManufacturer();
	}
}
