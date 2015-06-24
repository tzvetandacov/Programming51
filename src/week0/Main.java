package week0;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 5;
		int b = 13;

		System.out.println("a + b = " + (a + b));
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("i = " + i);
		}
		if (a < b) {
			System.out.println("a is smaler");
		} else {
			System.out.println("b is smaller");
		}
		int i = 0;
		while (i < 10) {
			System.out.println("i =" + i);
			i++;

		}

		int[] f = { 1, 2, 3, 4, 5 };
	}
}
