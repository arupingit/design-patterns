package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class SpamHandler extends AbstractEmailHandler {

	@Override
	public String[] getKeyWords() {
		return new String[]{"Lottery","Jackpot"};
	}

	@Override
	public void handleEmailHere(String email) {
		System.out.println("This email is a Spam");
	}

}
