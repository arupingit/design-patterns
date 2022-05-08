package com.arup.dp.structuralDesignPatterns.decoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator {
	Coffee coffee;
	
	SugarDecorator(Coffee coffee){
		this.coffee = coffee;
	}

	public String getDescription(){
		return this.coffee.getDescription() + "sugar,"; 
	}
	
	
	@Override
	public int getCost() {
		return this.coffee.getCost() + 1;
	}

}
