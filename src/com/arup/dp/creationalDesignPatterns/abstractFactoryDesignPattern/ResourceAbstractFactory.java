package com.arup.dp.creationalDesignPatterns.abstractFactoryDesignPattern;

public class ResourceAbstractFactory {

	public ResourceFactory getResouceFactory(String seniorityLevel){
		if("senior".equalsIgnoreCase(seniorityLevel)){
			return new SeniorResourceFactory();
		}
		if("junior".equalsIgnoreCase(seniorityLevel)){
			return new JuniorResourceFactory();
		}
		return null;
	}
}
