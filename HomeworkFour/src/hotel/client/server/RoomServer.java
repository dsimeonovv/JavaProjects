package hotel.client.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class RoomServer {
	
	
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1234);
		
		System.out.println("Server Started");
		while(true){
			Socket s = ss.accept();
			Thread t1 = new RoomClientThread(s);
			t1.start();
			
		}
	}
}
