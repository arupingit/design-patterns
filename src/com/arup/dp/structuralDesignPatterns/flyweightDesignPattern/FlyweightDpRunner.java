package com.arup.dp.structuralDesignPatterns.flyweightDesignPattern;

public class FlyweightDpRunner {

	public static void main(String[] args) {
		Animal a = AnimalFactory.getAnimal("cat");
		a.setExtrinsicAttributes();
		a.printAnimalAttributes();
	}
}
