package com.arup.dp.structuralDesignPatterns.facadeDesignPattern;

public class FacadeDpRunner {

	public static void main(String[] args) {
		Vehicle v = new Car();
		new SellVehicleFacade(v).sellVehicle();
	}
}
