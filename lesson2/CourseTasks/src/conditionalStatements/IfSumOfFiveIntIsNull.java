package conditionalStatements;

import java.util.Scanner;

public class IfSumOfFiveIntIsNull {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter first int: ");
		int first = input.nextInt();
		System.out.println("Enter second int: ");
		int second = input.nextInt();
		System.out.println("Enter third int: ");
		int third = input.nextInt();
		System.out.println("Enter fourth int: ");
		int fourth = input.nextInt();
		System.out.println("Enter five int: ");
		int five = input.nextInt();
		
		if(first + second + third == 0){
			System.out.println(first + "+" + second + "+" + third + "= 0" );
		}
		else if(first + fourth + five == 0){
			System.out.println(first + "+" + fourth + "+" + five + "= 0" );
		}
	}
}
