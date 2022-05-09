package com.arup.dp.behavioralDesignPatterns.observerDesignPattern;

public class ObserverDpRunner{

	public static void main(String[] args) throws InterruptedException {
		Observer s1 = new SubscriberOne();
		Observer s2 = new SubscriberTwo();
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.registerObserver(s1);
		weatherStation.registerObserver(s2);
		weatherStation.updateWeatherData("very humidity", 35);
		Thread.sleep(1000);
		weatherStation.updateWeatherData("low humidity", 40);
		Thread.sleep(1000);
		weatherStation.removeObserver(0);
		weatherStation.updateWeatherData("very humidity", 30);
	}

}
