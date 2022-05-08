package com.arup.dp.creationalDesignPatterns.abstractFactoryDesignPattern;

public class AbstractFactoryRunner {

	public static void main(String[] args) {
		String seniorityLevel = "senior";
		String technology = "java";
		Resource resouce = new ResourceAbstractFactory().getResouceFactory(seniorityLevel).getResource(technology);
		System.out.println(resouce.getResourceDetails());
	}

}
