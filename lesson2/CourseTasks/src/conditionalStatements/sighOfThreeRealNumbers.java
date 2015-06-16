package conditionalStatements;

import java.util.Scanner;

public class sighOfThreeRealNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first real number: ");
		int first = input.nextInt();
		System.out.println("Enter second real number: ");
		int second = input.nextInt();
		System.out.println("Enter third real number: ");
		int third = input.nextInt();
		
		if(first < 0){
			System.out.println("The sigh of first int is -");
		}
		if(first > 0){
			System.out.println("The sigh of first int is +");
		}
		if(second < 0){
			System.out.println("The sigh of second int is -");
		}
		if(second > 0){
			System.out.println("The sigh of second int is +");
		}
		if(third < 0){
			System.out.println("The sigh of third int is -");
		}
		if(third > 0){
			System.out.println("The sigh of third int is +");
		}
		if(first == 0 || second == 0 || third == 0){
			System.out.println("Some of ints is 0");
		}
		
	}
}
