package demo2;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press enter to stop..");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutDown();
		
	}
}
