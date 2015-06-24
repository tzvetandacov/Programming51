package com.hackbulgaria.programming51.week3;

public class Arr {
	public static String toString(int[] a) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			if ((i == a.length - 1)) {
				result += a[i];
			} else {
				result += a[i] + ",";
			}

		}
		return result;
	}

	public static int[] reverse(int[] a) {
		int[] result = new int[a.length];
		int i = 0;
		int j = a.length - 1;

		while (i < a.length && j >= 0) {
			result[i] = a[j];
			i++;
			j--;
		}
		return result;
	}

	public static String join(int[] a, String glue) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				result += a[i];

			} else {
				result += a[i] + glue;
			}
		}
		return result;
	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

		}
		return sum;
	}

	public static int[] range(int a, int b) {
		int[] result = new int[(b + 1) - a];
		int i = 0;
		while (a <= b) {
			result[i] = a;
			a++;
			i++;
		}
		return result;
	}

	public static int[] filterOdd(int[] a) {
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				counter += 1;

			}
		}
		int[] result = new int[counter];
		int i = 0;
		int j = 0;
		while (i < a.length) {
			if (a[i] % 2 != 0) {
				result[j] = a[i];
				j++;
			}
			i++;
		}
		return result;
	}
	public static void sort(int[] a){
		for(int i = 0; i<a.length;i++){
			for(int j = i + 1; j<a.length;j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
							
				}
			}
		}
	}
}
