package com.arup.dp.structuralDesignPatterns.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Employee {
	List<Employee> employeeList;
	
	public EmployeeList() {
		this.employeeList = new ArrayList<>();
	}

	@Override
	public void getEmployeeDetails() {
		for(Employee e : employeeList){
			e.getEmployeeDetails();
		}
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
}
