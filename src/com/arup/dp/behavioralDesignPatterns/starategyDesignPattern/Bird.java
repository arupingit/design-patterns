package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public abstract class Bird {

	protected FlyBehaviour flyBehaviour;
	Bird(FlyBehaviour flyBehaviour){
		this.flyBehaviour = flyBehaviour;
	}
	
	public abstract void fly();
}
