package com.arup.dp.behavioralDesignPatterns.observerDesignPattern;

public class SubscriberOne implements Observer {

	@Override
	public void update(String humidity, int temperature) {
		System.out.println("Subscriber1 updated : humidity="+ humidity +", temperature="+temperature);
	}

}
