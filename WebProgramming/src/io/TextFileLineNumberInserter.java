package io;

import java.io.*;
import java.lang.*;



public class TextFileLineNumberInserter {
	public static void main(String[] args) throws IOException {
		FileReader inFile = new FileReader("input.txt");
		BufferedReader in = new BufferedReader(inFile);
		
		FileWriter outFile = new FileWriter("output.txt");
		PrintWriter out = new PrintWriter(outFile);
		
		int lineCount = 0;
		String str;
		
		while((str = in.readLine()) != null){
			lineCount++;
			out.println(lineCount + " " + str);
		}
		
		in.close();
		out.close();
		
		
	}
}
