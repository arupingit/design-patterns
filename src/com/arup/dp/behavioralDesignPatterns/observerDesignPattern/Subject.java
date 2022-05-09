package com.arup.dp.behavioralDesignPatterns.observerDesignPattern;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(int index);
	public void notifyObservers();
}
