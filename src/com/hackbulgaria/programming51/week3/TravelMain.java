package com.hackbulgaria.programming51.week3;

public class TravelMain {

	public static void main(String[] args) {
		Employee rado = new Employee("Radoslav Georgiev");
		Employee tzvetan = new Employee("Tzvetan Dacov");
		Employee ani = new Employee("Ani Stoycheva");
		TravelExpense dinner = new TravelExpense("Dinner", ani, 50);
		System.out.println(dinner.getType().equals("Dinner"));
		System.out.println(dinner.getEmployee().toString().equals("Ani Stoycheva"));
	}	

}
