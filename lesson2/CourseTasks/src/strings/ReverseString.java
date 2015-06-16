package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter some text");
        String input = n.next();
        String reversed="";

        for (int i = input.length() - 1; i >= 0; i--){
        	 reversed += i;
        }
        System.out.println(reversed);
	}
}
