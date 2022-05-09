package com.arup.dp.behavioralDesignPatterns.templateMethodDesignPattern;

public abstract class AbstractBookletPrinter {

	protected abstract int getPageCount();
	protected abstract void printFrontCover();
	protected abstract void printBackCover();
	protected abstract void printPages();
	
	protected final void print(){
		printFrontCover();
		for(int i=0;i<getPageCount();i++){
			printPages();
		}
		printBackCover();
	}
}
