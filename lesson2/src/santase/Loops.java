package santase;
import java.util.Scanner;

public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int num = 1;
		int sum = 1;
		
		System.out.print("The sum 1 ");
		while(num < n){
			num++;
			sum += num;
			System.out.printf("+%d", num);
		}
		System.out.printf("=%d%n", sum);*/
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter positive number: ");
		int num = input.nextInt();
		int divider = 2;
		int maxDivider = (int) Math.sqrt(num);
		boolean prime = true;
		
		while(prime && (divider <= maxDivider)){
			if(num % divider == 0){
				prime = false;
			}
			divider++;
		}
		System.out.println("Is it prime?" + prime);*/
		
		/*Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long factorial = 1;
		
		while(true){
			if(n == 1){
				break;
			}
			factorial *= n;
			n--;
		}
		System.out.println("n! = " + factorial);*/
		
		/*Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int row = 1; row <= n; row++){
			for(int cow = 1; cow <= row; cow++){
				System.out.print(cow + " ");
			}
			System.out.println();
		}*/
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.println(i);
		}
	}

}
