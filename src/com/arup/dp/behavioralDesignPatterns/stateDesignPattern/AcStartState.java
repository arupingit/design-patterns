package com.arup.dp.behavioralDesignPatterns.stateDesignPattern;

public class AcStartState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned ON");
	}

}
