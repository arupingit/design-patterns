package com.arup.dp.creationalDesignPatterns.builderDesignPattern;

public class BuilderDpRunner {

	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("1800cc",4).setAirbag(true).build();
		System.out.println(car);
		Vehicle bike = new Vehicle.VehicleBuilder("500cc", 2).build();
		System.out.println(bike);
	}

}
