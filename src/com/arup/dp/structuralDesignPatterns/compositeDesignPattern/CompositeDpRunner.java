package com.arup.dp.structuralDesignPatterns.compositeDesignPattern;

public class CompositeDpRunner {

	public static void main(String[] args) {
		Employee e1 = new Developer("java", 10);
		Employee e2 = new Developer("dotnet", 15);
		Employee eList = new EmployeeList();
		eList.addEmployee(new Developer("testing",6));
		eList.addEmployee(new Developer("javascript",6));
		
		e1.getEmployeeDetails();
		e2.getEmployeeDetails();
		eList.getEmployeeDetails();
	}

}
