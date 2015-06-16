package santase;

import java.util.Scanner;

public class Dom1{
	public static double[] quotients;

	public static void main(String[] args) {

		float x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the power of the polynom: ");
		int n = sc.nextInt();
		quotients = new double[n+1];
		for (int i = 0; i <= n; i++) {
			System.out.print("Enter quetients before x on power " + (i) + ":");
			quotients[i] = sc.nextInt();
		}

		System.out.println("Enter x:");
		x = sc.nextFloat();
		printPolynomValue(x,n);
		
		
		}

	public static void printPolynomValue(float x,int n) {

		double value = 0;
		for (int i = 0; i <= n; i++) {
			value += (quotients[i] * Math.pow(x, i));
		}
		System.out.println("Polynom value is: " + value);
	}

}
