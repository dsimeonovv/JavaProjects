package inputOutput;

import java.util.Scanner;

public class SumOfThreeIntegers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum;
		
		System.out.println("Enter the first integer: ");
		int n = input.nextInt();
		System.out.println("Enter the second integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter the third integer: ");
		int n2 = input.nextInt();
		
		sum = n + n1 + n2;
		
		System.out.println("The sum of three integers is: " + sum);
	}
}
