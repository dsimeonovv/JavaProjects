package loops;

import java.util.Scanner;

public class PrintMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter N: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n + i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
