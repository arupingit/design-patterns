package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public class Penguin extends Bird {
	
	Penguin(FlyBehaviour flyBehaviour){
		super(flyBehaviour);
	}

	@Override
	public void fly() {
		flyBehaviour.fly();
	}

}
