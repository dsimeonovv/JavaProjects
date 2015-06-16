package conditionalStatements;

import java.util.Scanner;

public class IntDoubleOrString {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter int, double or string variable(Example: 0,1,2): ");
		byte choice = input.nextByte();
		
		switch (choice) {
		case 0:
			System.out.println("Enter int variable:");
			int intVar = input.nextInt();
			intVar++;
			System.out.println("The new variable is: " + intVar);
			break;
		case 1:
			System.out.println("Enter double variable:");
			double doubleVar = input.nextDouble();
			doubleVar++;
			System.out.println("The new variable is: " + doubleVar);
			break;
		case 2:
			System.out.println("Enter string variable:");
			String stringVar = input.next();
			System.out.print("The new string is: " + stringVar + "*");
			break;
		default:
			System.out.println("Wrong choice, try again!");
			break;
		}
	}
}
