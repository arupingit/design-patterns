package com.arup.dp.structuralDesignPatterns.flyweightDesignPattern;

public class Cow extends CommonAnimalAttributes implements Animal {
	
	String colorOfCow;
	
	@Override
	public void printAnimalAttributes() {
		System.out.println("number of eyes "+eyes);
		System.out.println("number of ears "+ears);
		System.out.println("number of nose "+nose);
		System.out.println("number of tail "+tail);
		System.out.println("color of cow "+colorOfCow);
	}

	@Override
	public void setExtrinsicAttributes() {
		this.colorOfCow = "white";
	}

}
