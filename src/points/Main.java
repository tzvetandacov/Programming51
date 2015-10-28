package points;

import java.util.Scanner;

public class Main {

	public static boolean isReversed = false;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the \"x\" value:");
		int x = input.nextInt();
		System.out.println("Enter the \"y\" value:");
		int y = input.nextInt();
		StartingPoint point = new StartingPoint(x, y);
		System.out.println("Enter the route string:");
		String route = input.next();
		DirectionsString directions = new DirectionsString(route);
		input.close();

		for (int i = 0; i < directions.route.length(); i++) {
			if (!isReversed) {
				if (directions.route.charAt(i) == '>') {
					point.x += 1;

				} else if (directions.route.charAt(i) == '<') {
					point.x -= 1;
				} else if (directions.route.charAt(i) == '^') {
					point.y -= 1;
				} else if (directions.route.charAt(i) == 'v') {
					point.y += 1;
				} else if (directions.route.charAt(i) == '~') {
					if (isReversed) {
						isReversed = false;
					} else {
						isReversed = true;
					}
				}
			} else if (isReversed) {
				if (directions.route.charAt(i) == '>') {
					point.x -= 1;

				} else if (directions.route.charAt(i) == '<') {
					point.x += 1;
				} else if (directions.route.charAt(i) == '^') {
					point.y += 1;
				} else if (directions.route.charAt(i) == 'v') {
					point.y -= 1;
				} else if (directions.route.charAt(i) == '~') {
					if (isReversed) {
						isReversed = false;
					} else {
						isReversed = true;
					}
				}
			}
		}
		// System.out.println('(' + point.x - 40 + ", " + point.y + ')' ); //
		// какъв е този бъг с -40 за point.x ?

		System.out.printf("(%d, %d)%n", point.x, point.y);
	}

}
