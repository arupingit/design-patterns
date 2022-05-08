package com.arup.dp.structuralDesignPatterns.decoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {
	
	Coffee coffee;
	
	MilkDecorator(Coffee coffee){
		this.coffee = coffee;
	}
	
	public String getDescription(){
		return coffee.getDescription() + "milk,";
	}
	
	@Override
	public int getCost() {
		return coffee.getCost() + 2;
	}

}
