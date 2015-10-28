package wordGame;

public class SearchMethods {
	public static int result = 0;

	// public boolean isPalindrome = false;

	/**
	 * public static String toString(String string){ String result = new
	 * String(); for (int i = 0; i < string.length(); i++) { result +=
	 * string.charAt(i); } return result; }
	 **/

	public static boolean isPalindrome(String word) {
		return word.equals(SearchMethods.reverse(word));

	}

	public static String reverse(String string) {
		String result = new String();
		for (int i = 0; i < string.length(); i++) {
			result = string.charAt(i) + result;
		}
		return result;
	}

	public static void horizontalCheck(char[][] matrix, String word) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				String isWord = new String();
				if (matrix[row][col] == word.charAt(0)
						&& (matrix[row].length - col) >= word.length()) {

					for (int wi = 0; wi < word.length(); wi++) {
						isWord += matrix[row][col + wi];

					}

				}
				if (word.equals(isWord)) {
					SearchMethods.result++;
					// isWord = null;
				} else {
					// isWord = null;
				}
			}
		}

	}

	public static void verticalCheck(char[][] matrix, String word) {
		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 0; row < matrix.length; row++) {
				String isWord = new String();
				if (matrix[row][col] == word.charAt(0)
						&& (matrix.length - row) >= word.length()) {

					for (int wi = 0; wi < word.length(); wi++) {
						isWord += matrix[row + wi][col];

					}

				}
				if (word.equals(isWord)) {
					SearchMethods.result++;
					isWord = null;
				} else {
					isWord = null;
				}
			}
		}

	}

	/*
	 * public static void mainDiagonal(char[][] matrix, String word) {
	 * 
	 * for (int i = 0; i < matrix[0].length; i++) { String isWord = new
	 * String();
	 * 
	 * if (matrix[i][i] == word.charAt(0) && (matrix[0].length - i) >=
	 * word.length()) {
	 * 
	 * for (int wi = 0; wi < word.length(); wi++) { isWord += matrix[i + wi][i +
	 * wi];
	 * 
	 * }
	 * 
	 * } if (word.equals(isWord)) { SearchMethods.result++; isWord = null; }
	 * else { isWord = null; } }
	 * 
	 * }
	 */
	public static void sdDiagonal(char[][] matrix, String word) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				String temp = new String();
				if (matrix[row][col] == word.charAt(0)
						&& (matrix[0].length - col) >= word.length() && matrix.length - row >= word.length()
						&& (matrix.length - row) >= word.length()) {

					for (int wi = 0; wi < word.length(); wi++) {
						temp += matrix[row + wi][col + wi];

					}

				}
				if (word.equals(temp)) {
					SearchMethods.result++;
					temp = null;
				} else {
					temp = null;
				}
			}
		}
	}

	public static void suDiagonal(char[][] matrix, String word) {

		for (int row = matrix.length -1; row >= 0; row--) {
			for (int col = 0; col < matrix[0].length; col++) {
				String isWord = new String();
				if (matrix[row][col] == word.charAt(0)
						&& (matrix[row].length - col) >= word.length()
						&& matrix.length > word.length()) {

					for (int wi = 0; wi < word.length(); wi++) {
						isWord += matrix[row - wi][col + wi];

					}

				}
				if (word.equals(isWord)) {
					SearchMethods.result++;
					// isWord = null;
				//} else {
					// isWord = null;
				}
			}
		}

	}
}
