package com.arup.dp.behavioralDesignPatterns.stateDesignPattern;

public class StateContext implements State {
	
	private State state;
	
	StateContext(State state){
		this.state = state;
	}
	
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public void doAction() {
		state.doAction();
	}

}
