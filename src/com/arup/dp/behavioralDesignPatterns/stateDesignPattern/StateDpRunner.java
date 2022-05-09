package com.arup.dp.behavioralDesignPatterns.stateDesignPattern;

public class StateDpRunner {

	public static void main(String[] args) {
		AcStartState acStart = new AcStartState();
		StateContext stateContext = new StateContext(acStart);
		stateContext.doAction();
		
		System.out.println("------------------------------------");
		
		AcStopState acStop = new AcStopState();
		stateContext.setState(acStop);
		stateContext.doAction();
	}

}
