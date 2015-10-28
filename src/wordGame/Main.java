package wordGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns:");
		int columns = input.nextInt();
		char[][] matrix = new char[rows][columns];
		System.out
				.printf("Enter the characters for the matrix as a single string of %d letters:",
						columns * rows);
		String chars = input.next();
		System.out.println("Enter the searched word:");
		String word = input.next();

		input.close();
		
		String reversedMatrixWord = SearchMethods.reverse(word);
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				int indexOfChars = ((i + 1) * columns + ((j + 1) - columns)) - 1;
				matrix[i][j] = chars.charAt(indexOfChars);

			}
		}
		SearchMethods.horizontalCheck(matrix, word);
		SearchMethods.verticalCheck(matrix, word);
		SearchMethods.sdDiagonal(matrix, word);
		SearchMethods.suDiagonal(matrix, word);
		SearchMethods.horizontalCheck(matrix, reversedMatrixWord);
		SearchMethods.verticalCheck(matrix, reversedMatrixWord);
		SearchMethods.sdDiagonal(matrix, reversedMatrixWord);
		SearchMethods.suDiagonal(matrix, reversedMatrixWord);
		if(SearchMethods.isPalindrome(word)){
		System.out.println((SearchMethods.result) / 2);
		}else{
			System.out.println(SearchMethods.result);
		}
	}
}
