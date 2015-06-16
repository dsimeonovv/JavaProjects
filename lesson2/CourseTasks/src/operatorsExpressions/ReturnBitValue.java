package operatorsExpressions;

import java.util.Scanner;

public class ReturnBitValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
        int num = input.nextInt();
        System.out.println("Enter position: ");
        int pos = input.nextInt();
        
        int mask = 1 << pos;
        int numAndMask = num & mask;
        int bit = numAndMask >> pos;
        
        System.out.printf("The bit's value is: %d ", bit);
        
	}
}
