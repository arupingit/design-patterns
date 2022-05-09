package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I am flying with Wings");
	}

}
