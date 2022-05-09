package com.arup.dp.behavioralDesignPatterns.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	List<Observer> observerList = new ArrayList<>();
	String humidity;
	int temperature;
	
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(int index) {
		observerList.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observerList){
			o.update(humidity, temperature);
		}
	}
	
	public void updateWeatherData(String humidity, int temperature){
		this.humidity = humidity;
		this.temperature = temperature;
		this.notifyObservers();
	}

}
