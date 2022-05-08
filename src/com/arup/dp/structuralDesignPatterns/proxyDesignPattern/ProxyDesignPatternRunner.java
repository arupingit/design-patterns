package com.arup.dp.structuralDesignPatterns.proxyDesignPattern;

public class ProxyDesignPatternRunner {

	public static void main(String[] args) {
		Vehicle v = new ProxyCar();
		v.getColor();
	}

}
