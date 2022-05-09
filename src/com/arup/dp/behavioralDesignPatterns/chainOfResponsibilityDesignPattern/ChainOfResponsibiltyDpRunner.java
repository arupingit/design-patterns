package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class ChainOfResponsibiltyDpRunner {

	public static void main(String[] args) {
		EmailHandler spamEmailHandler = new SpamHandler();
		EmailHandler jobEmailHandler = new JobEmailHandler();
		EmailHandler defaultEmailHandler = new GeneralEmailHandler();
				
		spamEmailHandler.setNextHandler(jobEmailHandler);
		jobEmailHandler.setNextHandler(defaultEmailHandler);
		
		spamEmailHandler.processHandler("You are a Jackpot winner");
		spamEmailHandler.processHandler("This is a jobs notification");
		spamEmailHandler.processHandler("This is a general email");
	}

}
