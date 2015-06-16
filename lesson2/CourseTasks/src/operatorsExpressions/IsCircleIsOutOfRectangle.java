package operatorsExpressions;

import java.util.Scanner;



public class IsCircleIsOutOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();
        
        double cx = 1;
        double cy = 1;
        double crad = 3;
        double rtop = 1;
        double rleft = -1;
        double rwidth = 6;
        double rheight = 2;
        double dist;
        
        dist = Math.sqrt(Math.abs(x - cx) * Math.abs(x - cx) + Math.abs(y - cy) * Math.abs(y - cy));
        
        if((dist <= crad) && ((x < rleft || x > rleft+rwidth) || (y > rtop || y < rtop-rheight))){
            System.out.printf("The point %d, %d is in the cirle and out of the rectangle.",x,y);
        }
        else{
            System.out.printf("The point %d, %d is either out of the circle or in the rectangle", x, y);
        }
	}
}
