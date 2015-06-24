package com.hackbulgaria.programming51.week1;

public class Overflow_integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int overflow = 1;
		while(true){
			overflow = overflow + 100;
			if(overflow < 0){
				System.out.println("overflow is negative " + overflow );
			}
			
		}

	}

} 
