package strings;

import java.util.Scanner;

public class BreckedCorrection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter expresion");
		String inputExpresion = input.next();

		int leftCounter = 0;
		int rightCounter = 0;

		for (int i = 0; i < inputExpresion.length(); i++) {
			if (inputExpresion.indexOf(i) == '(') {
				leftCounter++;
			}

			if (inputExpresion.indexOf(i) == ')') {
				rightCounter++;
			}
		}
		if (rightCounter == leftCounter)
			System.out.println("Correct Expresion.");
		else
			System.out.println("Incorect Expresion.");
	}
}
