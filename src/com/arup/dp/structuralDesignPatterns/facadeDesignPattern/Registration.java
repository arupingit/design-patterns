package com.arup.dp.structuralDesignPatterns.facadeDesignPattern;

public class Registration {
	Vehicle v;
	
	Registration(Vehicle v){
		this.v = v;
	}
	
	public void prepareLicensePlate(){
		System.out.println("Preparing license plate number");
	}
	
	public void prepareRegistration(){
		System.out.println("Prepare registration documents");
	}
}
