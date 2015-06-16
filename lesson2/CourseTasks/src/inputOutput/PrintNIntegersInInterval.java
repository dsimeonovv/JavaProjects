package inputOutput;

import java.util.Scanner;

public class PrintNIntegersInInterval {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startInt = 1;
		
		System.out.println("Give the end point of interval: ");
		int n = input.nextInt();
		
		for (int i = startInt; i < n; i++) {
			System.out.println("The number is: " + i);
		}
	}
}
