package inputOutput;

import java.util.Scanner;

public class SumOfnNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Tell me the sum of how many numbers you want to see: ");
		int n = input.nextInt();
		
		System.out.println("Now give the numbers for sum: ");
		for (int i = 0; i < n; i++) {
			int n1 = input.nextInt();
			sum += n1;
		}
		System.out.println("The sum is: " + sum);
	}
}
