package com.arup.dp.creationalDesignPatterns.singleton;

public class VehicleSerialNumber {
	
	private int serialNumber = 0;
	private static VehicleSerialNumber v;
	
	private VehicleSerialNumber(){
		
	}
	
	public static VehicleSerialNumber getInstance(){
		if(v==null){
			v = new VehicleSerialNumber();
		}
		return v;
	}
	
	public synchronized int generateSerialNumber(){
		return ++serialNumber;
	}

}
