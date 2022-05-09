package com.arup.dp.structuralDesignPatterns.compositeDesignPattern;

public class Developer implements Employee {
	
	String technology;
	int yearsOfExperience;
	
	public Developer(String technology, int yearsOfExperience) {
		this.technology = technology;
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void getEmployeeDetails() {
		System.out.println("Developer [technology=" + technology + ", yearsOfExperience=" + yearsOfExperience + "]");
	}

	@Override
	public void addEmployee(Employee employee) {
		// Do nothing
		System.out.println("unsupported operation on object");
	}
}
