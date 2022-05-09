package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public class NoOpsFlying implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I do not know how to fly");
	}

}
