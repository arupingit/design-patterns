package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public interface EmailHandler {

	public void setNextHandler(EmailHandler nextHandler);
	public void processHandler(String email);
}
