package com.hackbulgaria.programming51.week2;

public class Fridge {
	Food[] foods = new Food[10];
	int capacity = 10;
	double weight = 100000;
	int counter = 0;

	public Fridge(int capacity, double weight) {
		this.capacity = capacity;
		this.weight = weight;
	}

	public boolean addFood(Food f) {

		if (foods[counter] != f) {
			foods[counter] = f;
			counter++;
			return true;
		}

		return false;
	}

	public void checkFoods() {
		for (int i = 0; i < counter; i++) {
			System.out.println(foods[i]);
		}

	}

	public int getFoodsCount() {
		return counter;
	}

	public String[] getProductsOfType(String type1) {
		String[] productOfType = new String[counter];
		for (int i = 0, j = 0; i < counter; i++, j++) {
			if (foods[i].type.equals(type1)) {
				productOfType[j] = foods[i].name;
			}

		}

		for (int i = 0; i < counter; i++) {
			System.out.println(productOfType[i]);
		}
		return productOfType;
	}

	public double getWeight() {
		double sum = 0;
		for (int i = 0; i < counter; i++) {
			sum += foods[i].weight;
		}
		return sum;
	}

	public double getMaxWeight() {
		return this.weight;
	}

	public Food getHeaviestFood() {
		Food heaviest = foods[0];
		for (int i = 0; i < counter - 1; i++) {
			if (foods[i].weight < foods[i + 1].weight) {
				heaviest = foods[i + 1];
			}
		}

		return heaviest;
	}
	public int getCapacity(){
		return this.capacity;
	}
}
