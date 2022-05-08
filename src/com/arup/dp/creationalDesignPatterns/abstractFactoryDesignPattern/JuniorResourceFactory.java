package com.arup.dp.creationalDesignPatterns.abstractFactoryDesignPattern;

public class JuniorResourceFactory implements ResourceFactory {

	@Override
	public Resource getResource(String technology) {
		if("java".equalsIgnoreCase(technology)){
			return new JavaJuniorResource();
		}
		if("dotnet".equalsIgnoreCase(technology)){
			return new DotNetJuniorResource();
		}
		return null;
	}

}
