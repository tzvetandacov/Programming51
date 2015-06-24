package com.hackbulgaria.programming51.week2;

public class Coffee {
	public String brand = "";
	public double price;
	
	public Coffee(){
		
	}
	
	public Coffee(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return "Brand is " + brand + " and price is:" + price; 
	}
}
