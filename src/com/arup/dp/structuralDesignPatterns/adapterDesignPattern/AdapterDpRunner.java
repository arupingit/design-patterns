package com.arup.dp.structuralDesignPatterns.adapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AdapterDpRunner {

	public static void main(String[] args) {
		List<Engine> engineList = new ArrayList<>();
		engineList.add(new TurboEngine());
		engineList.add(new GreeneEngineAdapter(new GreeneEngine()));
		
		for(Engine e : engineList){
			System.out.println(e.getEngineSize());
		}
	}

}
