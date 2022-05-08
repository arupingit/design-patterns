package com.arup.dp.creationalDesignPatterns.prototypeDesignPattern;

public class PrototypeDpRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v1 = (Vehicle) Vehicle.getClonedVehicle();
		Vehicle v2 = (Vehicle) Vehicle.getClonedVehicle();
		
		System.out.println(v1);
		System.out.println(v2);
	}

}
