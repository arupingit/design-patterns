package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class RadioVolumeDown implements Command {
	Radio radio;
	
	RadioVolumeDown(Radio radio){
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.off();
	}

}
