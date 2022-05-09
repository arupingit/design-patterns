package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class AlexaSpeechRecognizer {
	Command onCommand;
	Command offCommand;
	
	AlexaSpeechRecognizer(Command onCommand, Command offCommand){
		this.offCommand = offCommand;
		this.onCommand = onCommand;
	}

	public void recognizeOnCommand(){
		onCommand.execute();
	}
	
	public void recognizeOffCommand(){
		offCommand.execute();
	}
}
