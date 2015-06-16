package arrays;

import java.util.Scanner;

public class Find3x3matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter width:");
		int n = input.nextInt();
		System.out.println("Enter height: ");
		int m = input.nextInt();
		int[][] numberMatrix = new int[n][m];
		int max = 0;
		int sum = 0;
		int startw = 0;
		int starth = 0;

		System.out.println("Enter the matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				numberMatrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Entered matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(numberMatrix[j][i] + " ");
				System.out.println();
			}
		}
		System.out.println();

		int hindex = 0;
		int windex = 0;

		while (windex < n - 2) {
			while (hindex < m - 2) {
				for (int i = windex; i < windex + 3; i++) {
					for (int j = hindex; j < hindex + 3; j++) {
						sum += numberMatrix[i][j];
					}
				}
				if (sum > max) {
					max = sum;
					starth = hindex;
					startw = windex;
				}
				sum = 0;
				hindex++;
			}
			windex++;
			hindex = 0;
		}

		System.out.println("3x3 submatrix with max sum: ");

		for (int i = startw; i < startw + 3; i++) {
			for (int j = starth; j < starth + 3; j++) {
				System.out.print(numberMatrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}
