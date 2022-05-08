package com.arup.dp.structuralDesignPatterns.flyweightDesignPattern;

public class Cat extends CommonAnimalAttributes implements Animal {

	String typeOfAnimal;
	
	@Override
	public void printAnimalAttributes() {
		System.out.println("number of eyes "+eyes);
		System.out.println("number of ears "+ears);
		System.out.println("number of nose "+nose);
		System.out.println("number of tail "+tail);
		System.out.println("type of animal "+typeOfAnimal);
	}

	@Override
	public void setExtrinsicAttributes() {
		this.typeOfAnimal = "Cat";
	}

}
