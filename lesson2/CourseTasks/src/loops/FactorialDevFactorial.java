package loops;

import java.util.Scanner;

public class FactorialDevFactorial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for numerator:");
        int numerator = input.nextInt();
        System.out.println("Enter value for denumerator:");
        int denumerator = input.nextInt();
        
        numerator = Factorial(numerator);
        denumerator = Factorial(denumerator);
        double sum = (double) numerator / (double) denumerator;
        System.out.printf("Result: %f", sum);
	}

	public static int Factorial(int n) {
		int result = 1;

		if (n <= 1) {
			return 1;
		}

		for (int i = 2; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
}
