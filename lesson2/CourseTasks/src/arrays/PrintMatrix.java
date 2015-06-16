package arrays;

import java.util.Scanner;

public class PrintMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
        int index = 1;
        int[][] numbersArray = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                numbersArray[i][j] = index;
                index++;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
            {
                System.out.print(numbersArray[j][i] + " ");
            }

            System.out.println();
        }
	}
}
