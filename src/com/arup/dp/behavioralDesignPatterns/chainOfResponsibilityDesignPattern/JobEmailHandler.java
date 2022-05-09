package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class JobEmailHandler extends AbstractEmailHandler {

	@Override
	public String[] getKeyWords() {
		return new String[]{"jobs","carrier"};
	}

	@Override
	public void handleEmailHere(String email) {
		System.out.println("This is an Job email");
	}

}
