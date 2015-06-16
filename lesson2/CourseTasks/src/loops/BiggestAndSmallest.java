package loops;

import java.util.Scanner;

public class BiggestAndSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int min = 0;
        int max = 0;
        System.out.println("How many numbers would you like to enter?:");
        int n = input.nextInt();
        System.out.printf("Enter %d numbers%n",n);
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
            if (a[i] <= min){
            	min = a[i];
            }
            if (a[i] > max){
            	max = a[i];
            }
        }
        System.out.printf("Max is: %d  Min is: %d", max,min);
	}
}
