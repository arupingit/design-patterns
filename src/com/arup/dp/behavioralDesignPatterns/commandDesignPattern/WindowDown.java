package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class WindowDown implements Command {
	Window window;
	
	WindowDown(Window window){
		this.window = window;
	}
	
	@Override
	public void execute() {
		window.on();
	}

}
