package conditionalStatements;

import java.util.Scanner;

public class ExchangeTwoValues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first int: ");
		int first = input.nextInt();
		System.out.println("Enter second int: ");
		int second = input.nextInt();
		
		if(first > second){
			second = first;
			System.out.println("Second: " + second);
		}
		else{
			System.out.println("First and second:" + first + " " + second);
		}
	}
}

