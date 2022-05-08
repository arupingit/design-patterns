package com.arup.dp.creationalDesignPatterns.builderDesignPattern;

public class Vehicle {
	
	//Necessary feature
	int noOfWheels;
	String engine;
	
	//Optional Feature
	boolean airbag;
	
	private Vehicle(String engine, int noOfWheels){
		this.engine = engine;
		this.noOfWheels = noOfWheels;
	}
	
	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", engine=" + engine + ", airbag=" + airbag + "]";
	}



	private void setAirbag(boolean airbag){
		this.airbag = airbag;
	}
	
	static class VehicleBuilder{
		int noOfWheels;
		String engine;
		boolean airbag;
		
		VehicleBuilder(String engine, int noOfWheels){
			this.engine = engine;
			this.noOfWheels = noOfWheels;
		}
		
		public VehicleBuilder setAirbag(boolean airbag){
			this.airbag = airbag;
			return this;
		}
		
		public Vehicle build(){
			Vehicle v = new Vehicle(this.engine, this.noOfWheels);
			v.setAirbag(this.airbag);
			return v;
		}
	}

}
