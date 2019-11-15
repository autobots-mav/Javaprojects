package seleniumTraining;

public class floydsTriangle {

	public static void main(String[] args) {

		int n = 5;
		int a = 1;
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(a+" ");
				a++;
			}

			System.out.println();

		}

	}

}
