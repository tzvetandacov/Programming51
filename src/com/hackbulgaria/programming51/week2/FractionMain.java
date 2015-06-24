package com.hackbulgaria.programming51.week2;


public class FractionMain {

	public static void main(String[] args) {
		Fraction onethird = new Fraction(1, 3);
		Fraction toSum = new Fraction(14, 28);
		
		System.out.println(onethird.getReal());
		System.out.println(onethird.sum(toSum));
		toSum.simplify();
		System.out.println(toSum);
	}

}
