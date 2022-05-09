package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public class Duck extends Bird {

	Duck(FlyBehaviour flyBehaviour) {
		super(flyBehaviour);
	}

	@Override
	public void fly() {
		flyBehaviour.fly();
	}

}
