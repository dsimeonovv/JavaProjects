package classesAndObjects;

import java.util.Scanner;

public class DateTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year:");
        int selectedYear = input.nextInt();
        
        
       
        if((selectedYear % 400 == 0) || ((selectedYear % 4 == 0) && (selectedYear % 100 != 0))){
        	System.out.println("Year " + selectedYear + " is a leap year");
        }
        else{
        	System.out.println("Year " + selectedYear + " is not a leap year");
        }
	}
}
