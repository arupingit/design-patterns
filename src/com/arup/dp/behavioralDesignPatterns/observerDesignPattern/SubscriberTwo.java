package com.arup.dp.behavioralDesignPatterns.observerDesignPattern;

public class SubscriberTwo implements Observer {

	@Override
	public void update(String humidity, int temperature) {
		System.out.println("Subscriber2 updated : humidity="+ humidity +", temperature="+temperature);
	}
}
