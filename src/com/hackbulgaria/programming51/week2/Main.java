package com.hackbulgaria.programming51.week2;

public class Main {

	public static void main(String[] args) {
		
		Coffee novaBrazilia = new Coffee();
		novaBrazilia.brand = "Nova Brazilia";
		novaBrazilia.price = 1;
		System.out.println(novaBrazilia);
		
		Coffee jacobs = new Coffee();
		jacobs.brand = "Jacobs";
		jacobs.price = 2;
		System.out.println(jacobs);
		
    	Coffee lavazza = new Coffee();
 		lavazza.brand = "Lavazza";
		lavazza.price = 3;
		System.out.println(lavazza);
		
		Coffee java = new Coffee("Java", 2.80);
		Coffee arabica = new Coffee("Arabica", 1.40);
		Coffee brand6 = new Coffee("Brand6", 0.80);
		

	}

}
