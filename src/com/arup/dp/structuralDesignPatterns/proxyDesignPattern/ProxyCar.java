package com.arup.dp.structuralDesignPatterns.proxyDesignPattern;

public class ProxyCar extends Car {

	@Override
	public void getColor(){
		System.out.println("Run Security Scan");
		super.getColor();
		System.out.println("Run Post Security Scan");
	}
}
