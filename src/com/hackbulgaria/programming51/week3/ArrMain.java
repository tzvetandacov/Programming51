package com.hackbulgaria.programming51.week3;

public class ArrMain {

	public static void main(String[] args) {
		int [] a = {1,3,6,8};
		System.out.println(Arr.toString(a));
		int [] b = Arr.reverse(a);
		System.out.println(Arr.toString(b));
		System.out.println(Arr.join(a, "*"));
		System.out.println(Arr.sum(a));
		int [] range = Arr.range(3, 8);
		System.out.println(Arr.toString(range));
		int [] oddOnly = Arr.filterOdd(a);
		System.out.println(Arr.toString(oddOnly));
		int [] toSort = {3,2,-20,-56,122,12,14,-2305,4697,5739,576};
		Arr.sort(toSort);
		System.out.println(Arr.toString(toSort));
	}

}
