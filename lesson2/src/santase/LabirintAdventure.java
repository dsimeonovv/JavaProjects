package santase;
import java.util.Scanner;


public class LabirintAdventure {
	
	private static char[][] labirint = {
		{' ', ' ', ' ', '*', ' ', ' ', ' '},
		{'*', '*', ' ', '*', ' ', '*', ' '},
		{' ', ' ', ' ', ' ', ' ', ' ', ' '},
		{' ', '*', '*', '*', '*', '*', ' '},
		{' ', ' ', ' ', ' ', ' ', ' ', 'e'},
	};
	
	private static char[] path = new char[labirint[0].length * labirint.length];
	private static int position = 0;
	
	private static void findPath(int row, int cow, char direction){
		if((cow < 0) || (row < 0) || (cow >= labirint[0].length) || (row >= labirint[0].length)){
			//System.out.println("You are out of labirint!");
			return;
		}
		
		path[position] = direction;
		position++;
		
		if(labirint[row][cow] == 'e'){
			//System.out.println("You found the exit!");
			printPath(path, 1, position - 1);
		}
		
		// cell is not free
		if(labirint[row][cow] == ' '){
			// cell is visited
			labirint[row][cow] = 's';
			
			findPath(row, cow - 1, 'L'); //left
			findPath(row - 1, cow, 'U'); //up
			findPath(row, cow + 1, 'R'); //right
			findPath(row + 1, cow, 'D'); //down
			
			// cell is free
			labirint[row][cow] = ' ';
		}
		
		position--;
	}
	
	private static void printPath(char[] path, int startPos, int endPos){
		System.out.print("Found path to the exit: ");
		for(int pos = startPos; pos<=endPos; pos++){
			System.out.print(path[pos]);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		
		findPath(0, 0, 'S');

	}

}
