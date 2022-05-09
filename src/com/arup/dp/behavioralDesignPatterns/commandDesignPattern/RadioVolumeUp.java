package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class RadioVolumeUp implements Command {
	Radio radio;
	
	RadioVolumeUp(Radio radio){
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.on();
	}

}
