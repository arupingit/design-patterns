package com.arup.dp.behavioralDesignPatterns.stateDesignPattern;

public class AcStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned OFF");
	}
}
