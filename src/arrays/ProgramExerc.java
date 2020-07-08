package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Integer[][] mat = new Integer[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {

					System.out.println("Position: " + i + "," + j);

					if (j - 1 != -1)
						System.out.println("Left: " + mat[i][j - 1]);
					if (j + 1 != mat.length+1)
						System.out.println("Right: " + mat[i][j + 1]);
					if (i + 1 < mat.length)
						System.out.println("Down: " + mat[i + 1][j]);
					if (i - 1 != -1)
						System.out.println("Up: " + mat[i - 1][j]);
				}
			}
		}

		sc.close();
	}

}
