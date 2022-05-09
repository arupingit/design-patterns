package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class GeneralEmailHandler extends AbstractEmailHandler {

	@Override
	public String[] getKeyWords() {
		return null;
	}

	@Override
	public void handleEmailHere(String email) {
		System.out.println("Default email handler");
	}

}
