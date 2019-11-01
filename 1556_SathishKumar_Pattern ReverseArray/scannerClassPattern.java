package seleniumTraining;

import java.util.Scanner;

public class scannerClassPattern {

	static int n = 5;

	public static void pattern(int n) {
		Scanner cycle = new Scanner(System.in);
		// System.out.println(" to be printed ");
		String cycle1 = cycle.nextLine();

		int i, j;

		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern(6);

	}

}
