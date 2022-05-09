package com.arup.dp.behavioralDesignPatterns.starategyDesignPattern;

public class StrategyDpRunner {

	public static void main(String[] args) {
		FlyBehaviour noFly = new NoOpsFlying();
		Bird penguin = new Penguin(noFly);
		penguin.fly();
		
		FlyBehaviour flyWithWings = new FlyWithWings();
		Bird duck = new Duck(flyWithWings);
		duck.fly();
	}

}
