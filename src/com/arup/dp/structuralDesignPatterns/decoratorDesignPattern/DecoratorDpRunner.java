package com.arup.dp.structuralDesignPatterns.decoratorDesignPattern;

public class DecoratorDpRunner {

	public static void main(String[] args) {
		Coffee coffee = new Expresso();
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getCost());
		
		Coffee withMilk = new MilkDecorator(coffee);
		System.out.println(withMilk.getDescription());
		System.out.println(withMilk.getCost());
		
		Coffee withSugar = new SugarDecorator(withMilk);
		System.out.println(withSugar.getDescription());
		System.out.println(withSugar.getCost());
		
		Coffee withSugar2 = new SugarDecorator(withSugar);
		System.out.println(withSugar2.getDescription());
		System.out.println(withSugar2.getCost());
	}

}
