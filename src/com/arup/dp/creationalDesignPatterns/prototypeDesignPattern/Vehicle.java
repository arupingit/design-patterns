package com.arup.dp.creationalDesignPatterns.prototypeDesignPattern;

public class Vehicle implements Cloneable{
	private static Vehicle v;
	
	private Vehicle() throws CloneNotSupportedException{
		super.clone();
	}
	
	public static Object getClonedVehicle() throws CloneNotSupportedException{
		if(v==null){
			v = new Vehicle();
		}
		return v.clone();
	}
}
