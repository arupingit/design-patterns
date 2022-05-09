package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class WindowUp implements Command {
	Window window;
	
	WindowUp(Window window){
		this.window = window;
	}
	
	@Override
	public void execute() {
		window.off();
	}

}
