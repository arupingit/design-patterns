package com.arup.dp.structuralDesignPatterns.decoratorDesignPattern;

public abstract class CoffeeDecorator extends Coffee {
	 
	String description = "Unknown Description";
	
	public String getDescription(){
		return description;
	}
	
	public abstract int getCost(); 
}
