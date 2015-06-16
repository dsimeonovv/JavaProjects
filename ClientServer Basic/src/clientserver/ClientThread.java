package clientserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread {
	Socket s;
	Scanner in;
	PrintStream out;

	public ClientThread(Socket s) {
		this.s = s;
		try {
			in = new Scanner(s.getInputStream());
			out = new PrintStream(s.getOutputStream());
		} catch (IOException e) {
		}
	}
	
	public void run(){
		out.println("hello");
		boolean connect = true;
		
		while(connect){
			String input = in.nextLine();
			System.out.println(input);
			
			if(input.equals("gotin")){
				out.println("ei gotin");
			}
			else if(input.equals("logmeout")){
				connect = false;
			}
		}
	}
}