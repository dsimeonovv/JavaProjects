package methods;

import java.util.Scanner;

public class GetMaxBetweenThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max;
		
		System.out.println("Enter value for N1: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter value for N2: ");
		int n2 = input.nextInt();
		
		System.out.println("Enter value for N3: ");
		int n3 = input.nextInt();
		
		max = getMax(n1, getMax(n2, n3));
		
		System.out.println("The biggest of three is: " + max);
	}
	
	public static int getMax(int n1, int n2){
		if(n1 > n2){
			return n1;
		}
		else{
			return n2;
		}
	}
}
