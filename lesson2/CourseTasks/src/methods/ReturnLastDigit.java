package methods;

import java.util.Scanner;

public class ReturnLastDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tell me a number: ");
		int n = input.nextInt();
		
		System.out.printf("The last digit with word is %s ", returnDigit(n));
	}
	
	public static String returnDigit(int num) {
		String lastDigit = " ";
		
		num = num % 10;
		
		switch (num) {
		case 0:
			lastDigit = "Zero";
			break;
		case 1:
			lastDigit = "One";
			break;
		case 2:
			lastDigit = "Two";
			break;
		case 3:
			lastDigit = "Three";
			break;
		case 4:
			lastDigit = "Four";
			break;
		case 5:
			lastDigit = "Five";
			break;
		case 6:
			lastDigit = "Six";
			break;
		case 7:
			lastDigit = "Seven";
			break;
		case 8:
			lastDigit = "Eight";
			break;
		case 9:
			lastDigit = "Nine";
		default:
			System.out.println("Try again!");
			break;
		}
		return lastDigit;
	}
}