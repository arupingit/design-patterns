package com.arup.dp.behavioralDesignPatterns.commandDesignPattern;

public class Radio {

	public void on(){
		System.out.println("Set radio volume to 10");
		System.out.println("Set radio station to 99.5 FM");
	}
	
	public void off(){
		System.out.println("Set radio volume to 0");
		System.out.println("Set radio station to 0.0 FM");
	}
}
