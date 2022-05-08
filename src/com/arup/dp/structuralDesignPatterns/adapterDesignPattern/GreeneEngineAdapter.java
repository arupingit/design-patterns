package com.arup.dp.structuralDesignPatterns.adapterDesignPattern;

public class GreeneEngineAdapter extends AbstractEngineType {
	
	GreeneEngine ge;
	
	GreeneEngineAdapter(GreeneEngine ge){
		this.ge = ge;
	}
	

	@Override
	public String getEngineSize() {
		return ge.getEngineSizeOfGreenEngine();
	}

}
