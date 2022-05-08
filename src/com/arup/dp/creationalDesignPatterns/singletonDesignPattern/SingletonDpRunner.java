package com.arup.dp.creationalDesignPatterns.singletonDesignPattern;

public class SingletonDpRunner {
	public static void main(String[] args) {
		System.out.println(VehicleSerialNumber.getInstance().generateSerialNumber());
	}
}
