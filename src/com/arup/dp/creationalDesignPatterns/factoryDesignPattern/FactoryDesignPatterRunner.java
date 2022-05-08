package com.arup.dp.creationalDesignPatterns.factoryDesignPattern;

public class FactoryDesignPatterRunner {

	public static void main(String[] args) {
		VahicleFactory vf = new VahicleFactory();
		Vehicle v = vf.getVehicle("car");
		System.out.println(v);
		v = vf.getVehicle("bike");
		System.out.println(v);
	}

}
