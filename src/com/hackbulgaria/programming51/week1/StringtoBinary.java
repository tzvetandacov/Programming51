package com.hackbulgaria.programming51.week1;

public class StringtoBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 18;
		System.out.println(toBinary(a));
	}

	public static String toBinary(int n){
		String result ="";
		while(n !=0){
			result = n % 2 + result;
	        n = n/2;
			
			
			
		}
		return result;
	}
}
