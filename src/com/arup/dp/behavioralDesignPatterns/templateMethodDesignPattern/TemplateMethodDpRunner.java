package com.arup.dp.behavioralDesignPatterns.templateMethodDesignPattern;

public class TemplateMethodDpRunner {

	public static void main(String[] args) {
		AbstractBookletPrinter bookPrinter = new JavaBookPrinter();
		bookPrinter.print();
	}

}
