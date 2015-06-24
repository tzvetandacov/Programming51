package com.hackbulgaria.programming51.week2;

public class Fraction {
	// attributes
	public int numerator;
	public int denominator;

	// constructor
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

		// methods
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}

	public double getReal() {
		return (double)this.numerator / this.denominator;
	}
	public String sum(Fraction frac2) {
		this.numerator = (this.numerator * frac2.denominator + frac2.numerator * this.denominator);
		this.denominator = (this.denominator * frac2.denominator);
		return toString();
	}
	public void simplify(){
		int counter = this.numerator;
		while(counter > 1){
			if (this.numerator % counter == 0 && this.denominator % counter == 0){
				this.numerator = this.numerator / counter;
				this.denominator = this.denominator / counter;
			} counter--;
		}
	}
}
