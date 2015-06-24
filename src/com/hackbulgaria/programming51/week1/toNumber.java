package com.hackbulgaria.programming51.week1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class toNumber {

	/**
	 * @param args
	 */
	public static String reverse(String binary) {
		String reverse = "";
		int index = 0;
		while (index < binary.length()) {
			reverse = binary.charAt(index) + reverse;
			index++;
		}
		return reverse;
	}

	public static int toNumber(String binary) {
		binary = reverse(binary);
		int result = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				result = (int) (result + Math.pow(2, i));

			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(toNumber("10010"));
		System.out.println((int) Math.pow(2, 32));
	}

}
