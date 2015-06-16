package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double result = 0;

		System.out.println("Choose option between 1 or 2 or 3(1 for plane, 2 for area, 3 e za neshto drugo)");
		byte choice = input.nextByte();

		switch (choice) {
		case 1:
			System.out.println("Give two values for x and y");
			double x = input.nextDouble();
			double y = input.nextDouble();
			if (x == 0 && y == 0) {
				System.out.println("The point and centre are equals.");
			}
			System.out.printf("The distance from point to centre is: " + findDistance(x, y));
			break;
		case 2:
			System.out.println("Give two values for x, y and z");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double z = input.nextDouble();
			if (x1 == 0 && y1 == 0 && z == 0) {
				System.out.println("The point and centre are equals.");
			}
			System.out.println("The distance in area from point to centre is: "	+ findDistance(x1, y1, z));
			break;
		case 3:
			System.out.println("Enter coordinates of first point: ");
			double x2 = input.nextDouble();
			double y3 = input.nextDouble();
			
			System.out.println("Enter coordinates of second point: ");
			double x3 = input.nextDouble();
			double y4 = input.nextDouble();
			
			result = ((x2-x3)*(x2-x3) + (y3-y4)*(y3-y4));
			System.out.println("result is:" + Math.sqrt(result));
			break;
		default:
			System.out.println("Wrond choice, try again!");
			break;
		}
		
		File f = new File("Fail");
		try {
			PrintStream ps = new PrintStream(f);
			ps.append("Resulta e:" + result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	public static double findDistance(double x, double y) {

		double hypotenuse = 0;

		hypotenuse = Math.sqrt((x * x) + (y * y));

		return hypotenuse;
	}

	public static double findDistance(double x, double y, double z) {

		double distance = 0;

		distance = Math.sqrt((x * x) + (y * y) + (z * z));

		return distance;
	}

}
