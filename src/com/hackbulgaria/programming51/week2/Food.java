package com.hackbulgaria.programming51.week2;

public class Food {
	public String name;
	public String type;
	public double weight;

	public Food(String name, String type, double weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	
	public String toString(){
		return name + " of type: " + type + " with wight: " + weight;
	}
		
	
}
