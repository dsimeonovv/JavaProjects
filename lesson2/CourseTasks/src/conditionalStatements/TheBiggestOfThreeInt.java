package conditionalStatements;

import java.util.Scanner;

public class TheBiggestOfThreeInt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first real number: ");
		int first = input.nextInt();
		System.out.println("Enter second real number: ");
		int second = input.nextInt();
		System.out.println("Enter third real number: ");
		int third = input.nextInt();
		
		if(first > second && first > third){
			System.out.println("The first is the biggest: " + first);
		}
		else if(second > first && second > third){
			System.out.println("The second is the biggest: " + second);
		}
		else if(third > first && third > second){
			System.out.println("The third is the biggest: " + third);
		}
		
	}
}
