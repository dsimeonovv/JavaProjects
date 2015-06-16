package tcpforwardserver;

import java.io.*;
import java.net.*;

public class TCPForwardServer {
	public static final int SOURCE_PORT = 2525;
	public static final String DESTINATION_HOST = "mail.abv.bg";
	public static final int DESTINATION_PORT = 25;
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(SOURCE_PORT);
		while(true){
			Socket clientSocket = serverSocket.accept();
			ClientThread clientThread = new ClientThread(clientSocket);
			clientThread.start();
		}
	}
}
