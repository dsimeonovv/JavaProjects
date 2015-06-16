package conditionalStatements;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int diskriminant;
		int x1;
		int x2;

		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Enter c: ");
		int c = input.nextInt();
		
		diskriminant = (b*b) - (4*a*c);
		
		if(diskriminant < 0){
			System.out.println("There is no conclusion.");
		}
		else if(diskriminant == 0){
			System.out.println("There is only one root");
			x1 = (-b)/(2*a);
		}
		else if(diskriminant > 0){
			System.out.println("There are two roots");
			x1 = (-b + (int) Math.sqrt(diskriminant))/2*a;
			x2 = (-b - (int) Math.sqrt(diskriminant))/2*a;
			System.out.println("They are: " + x1 + " " + x2);
		}
	}
}
