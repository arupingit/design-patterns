package com.arup.dp.creationalDesignPatterns.abstractFactoryDesignPattern;

public class SeniorResourceFactory implements ResourceFactory {

	@Override
	public Resource getResource(String technology) {
		if("java".equalsIgnoreCase(technology)){
			return new JavaSeniorResource();
		}
		if("dotnet".equalsIgnoreCase(technology)){
			return new DotNetSeniorResource();
		}
		return null;
	}

}
