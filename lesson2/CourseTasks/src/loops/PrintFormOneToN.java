package loops;

import java.util.Scanner;

public class PrintFormOneToN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value you want to see numbers: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
