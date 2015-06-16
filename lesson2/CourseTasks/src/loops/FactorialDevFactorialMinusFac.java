package loops;

import java.util.Scanner;

public class FactorialDevFactorialMinusFac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter value for N, that is greater than 1:");
		int n = input.nextInt();
		System.out.println("Enter value for K, that is greater than N:");
		int k = input.nextInt();

		int sum = Factorial(k - n);
		k = Factorial(k);
		n = Factorial(n);
		double result = ((double) n * (double) k) / (double) sum;
		System.out.printf("Result: %f", result);
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
