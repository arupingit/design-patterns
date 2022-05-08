package com.arup.dp.creationalDesignPatterns.factoryDesignPattern;

public class VahicleFactory {
	
	public Vehicle getVehicle(String vehicleType){
		if("car".equalsIgnoreCase(vehicleType)){
			return new Car();
		}
		if("bike".equalsIgnoreCase(vehicleType)){
			return new Bike();
		}
		return null;
	}

}
