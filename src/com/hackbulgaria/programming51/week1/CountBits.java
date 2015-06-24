package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class CountBits {
	public static String intToBinary(int n) {
		String result = "";
		while (n != 0) {
			result = n % 2 + result;
			n = n / 2;
		}
		return result;
	}

	public static int countBits(int n) {
		String toBinary = intToBinary(n);
		int result = toBinary.length();
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(countBits(n));

	}

}
