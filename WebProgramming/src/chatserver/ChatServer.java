package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(5555);
		System.out.println("Server started on port: " + serverSocket.getLocalPort());
		
		ServerMsgDispatcher dispatcher = new ServerMsgDispatcher();
		dispatcher.start();
		
		while(true){
			Socket clientSocket = serverSocket.accept();
			ClientListener clientListener = new ClientListener(clientSocket, dispatcher);
			dispatcher.addClient(clientSocket);
			clientListener.start();
		}
	}
}