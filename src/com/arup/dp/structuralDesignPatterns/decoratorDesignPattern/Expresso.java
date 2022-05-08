package com.arup.dp.structuralDesignPatterns.decoratorDesignPattern;

public class Expresso extends Coffee {

	String description = "Expresso, ";
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		return 3;
	}

}
