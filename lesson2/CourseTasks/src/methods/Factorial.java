package methods;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N in range 1~100");
        int n = input.nextInt();

        String answer = "1";

        for (int i = 2; i <= n; i++) 
        {
            answer = Multiplyer(answer, i);
        }
        System.out.println(answer);
	}

	public static String Multiplyer(String number, int digit){
		Scanner input = new Scanner(System.in);
        String result = null;
        int carry = 0;
        for (int i = number.length() - 1; i >= 0; i--){
        	int currDigit = 0;
        	
			int currProduct = currDigit  * digit;
            if (currProduct + carry < 10){
                result = (currProduct + carry) + result;
                carry = 0;
            }
            else{
                result = ((currProduct + carry) % 10) + result;
                carry = (currProduct + carry) / 10;
            }
        }
        if (carry != 0){
            result = carry + result;
        }
        return result;
    }
}
