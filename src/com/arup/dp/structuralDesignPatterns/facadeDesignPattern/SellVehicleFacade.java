package com.arup.dp.structuralDesignPatterns.facadeDesignPattern;

public class SellVehicleFacade {
	Vehicle v;
	
	SellVehicleFacade(Vehicle v){
		this.v = v;
	}
	
	public void sellVehicle(){
		Registration r = new Registration(v);
		r.prepareLicensePlate();
		r.prepareRegistration();
		v.cleanVehicle();
	}
}
