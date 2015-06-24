package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		char oper = input.next().charAt(0);
		int b = input.nextInt();

		if (oper == '+') {
			System.out.println((a + b));
		} else if (oper == '-') {
			System.out.println((a - b));
		} else if (oper == '*') {
			System.out.println(a * b);

		} else if (oper == '/') {
			System.out.println(a / b);
		} else if (oper == '^') {
			int result = 1;
			int i = 1;
			while (i <= b) {
				result = result * a;
				i++;

			}
			System.out.println(result);
		} else if (oper == '?') {

			int resulta = 1;
			while (a != 1) {
				resulta = resulta * a;
				a--;
			}

			int resultb = 1;
			while (b != 1) {
				resultb = resultb * b;
				b--;

			}
			System.out.println(resulta + resultb);
		}
	}

}
