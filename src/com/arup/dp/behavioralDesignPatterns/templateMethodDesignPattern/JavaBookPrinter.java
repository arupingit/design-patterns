package com.arup.dp.behavioralDesignPatterns.templateMethodDesignPattern;

public class JavaBookPrinter extends AbstractBookletPrinter {

	@Override
	protected int getPageCount() {
		return 3;
	}

	@Override
	protected void printFrontCover() {
		System.out.println("Printing Front Cover");
	}

	@Override
	protected void printBackCover() {
		System.out.println("Printing Back Cover");
	}

	@Override
	protected void printPages() {
		System.out.println("Printing Pages");
	}

}
