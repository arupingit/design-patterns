package com.arup.dp.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public abstract class AbstractEmailHandler implements EmailHandler {

	private EmailHandler nextEmailHandler;
	
	@Override
	public void setNextHandler(EmailHandler nextHandler) {
		this.nextEmailHandler = nextHandler;
	}

	@Override
	public void processHandler(String email) {
		boolean keyWordFound = false;
		String[] keyWords = this.getKeyWords();
		if(keyWords==null){
			keyWordFound = true;
		} else {
			for(String keyWord : this.getKeyWords()){
				if(email.contains(keyWord)){
					keyWordFound = true;
				}
			}			
		}
		if(keyWordFound){
			this.handleEmailHere(email);
		} else {
			this.nextEmailHandler.processHandler(email);
		}
	}
	
	public abstract String[] getKeyWords();
	public abstract void handleEmailHere(String email);
}
