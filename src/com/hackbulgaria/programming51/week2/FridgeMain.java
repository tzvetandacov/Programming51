package com.hackbulgaria.programming51.week2;


public class FridgeMain {
	public static void main(String[] args){
		Fridge tz = new Fridge(10, 1000);
		Food milk = new Food("milk","Milk", 1000);
		Food cheese = new Food("cheese","Milk",1500);
		System.out.println(tz.addFood(cheese));
		System.out.println(tz.addFood(milk));
		System.out.println(tz.counter);
		System.out.println(tz.capacity);
		tz.checkFoods();
		System.out.println(tz.getFoodsCount());
		System.out.println(tz.getProductsOfType("Milk"));
		System.out.println(tz.getWeight());
		System.out.println(tz.getMaxWeight());
		System.out.println(tz.getHeaviestFood());
		System.out.println(tz.getCapacity());
	}
}
