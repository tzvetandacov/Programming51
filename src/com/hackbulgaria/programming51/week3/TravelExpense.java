package com.hackbulgaria.programming51.week3;

public class TravelExpense {
	public String type;
	public Employee employee;
	public double cost = 0;

	public TravelExpense(String type, Employee employee, double cost) {
		this.type = type;
		this.employee = employee;
		this.cost = cost;

	}

	public String toString() {
		return "type: " + type + " employee: " + employee + " cost: " + cost;

	}

	public String getType() {
		return this.type;

	}
	public String getEmployee(){
		return employee.name;
	}
	public double getNetCost(){
		return this.cost;
	}
	
}
