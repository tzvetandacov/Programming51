package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = a;
		int reversed = 0;
		while (b != 0) {
			reversed = (reversed * 10) + (b % 10);
			b = b / 10;
		}

		System.out.println(reversed);

		int tempresult = a + reversed;

		int revresult = 0;
		int sumresult = a + reversed;

		while (tempresult != 0) {
			revresult = (revresult * 10) + (tempresult % 10);
			tempresult = tempresult / 10;
		}
		System.out.println(revresult);
		System.out.println(sumresult);

		if (revresult == sumresult) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
