package clientserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 1212);
		Scanner in = new Scanner(s.getInputStream());
		Scanner input = new Scanner(System.in);
		PrintStream out = new PrintStream(s.getOutputStream());
		
		System.out.println(in.nextLine());
		while(true){
			String inline = in.nextLine();
			out.println(inline);
			if(inline.equals("logmeout")){
				break;
			}
		}
	}
}
