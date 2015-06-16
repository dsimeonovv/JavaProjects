package methods;

import java.util.Scanner;

public class PrintName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = input.next();
		
		System.out.println("Hello " + getName(name));
	}
	
	public static String getName(String name){
		return name;
	}
}
