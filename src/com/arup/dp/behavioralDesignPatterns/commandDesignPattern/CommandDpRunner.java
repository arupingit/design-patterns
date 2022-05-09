package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class CommandDpRunner {
	
	public static void main(String[] args){
		Radio radio = new Radio();
		Command radioOnCommand = new RadioVolumeUp(radio);
		Command radioOffCommand = new RadioVolumeDown(radio);
		AlexaSpeechRecognizer alexa1 = new AlexaSpeechRecognizer(radioOnCommand, radioOffCommand);
		alexa1.recognizeOnCommand();
		alexa1.recognizeOffCommand();
		
		System.out.println("----------------------------------");
		
		Window window = new Window();
		Command windowUp = new WindowUp(window);
		Command windowDown = new WindowDown(window);
		AlexaSpeechRecognizer alexa2 = new AlexaSpeechRecognizer(windowDown, windowUp);
		alexa2.recognizeOnCommand();
		alexa2.recognizeOffCommand();
	}

}
