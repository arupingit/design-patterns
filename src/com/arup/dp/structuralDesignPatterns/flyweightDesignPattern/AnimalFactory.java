package com.arup.dp.structuralDesignPatterns.flyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

	private static Map<String,Animal> animalMap = new HashMap<>();
	
	public static Animal getAnimal(String animalType){
		Animal a = animalMap.get(animalType);
		if(a!=null){
			return a;
		}
		if("cow".equalsIgnoreCase(animalType)){
			a = new Cow();
			animalMap.put(animalType, a);
		}
		if("cat".equalsIgnoreCase(animalType)){
			a = new Cat();
			animalMap.put(animalType, a);
		}
		return a;
	}
}
