package chatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientListener extends Thread {

	private Socket mSocket;
	private ServerMsgDispatcher mDispatcher;
	private BufferedReader mSocketReader;

	public ClientListener(Socket aSocket, ServerMsgDispatcher aServerMsgDispatcher) throws IOException {
		this.mSocket = aSocket;
		mSocketReader = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
		this.mDispatcher = aServerMsgDispatcher;
	}
	
	public void run(){
		while(!isInterrupted()){
			try {
				String msg = mSocketReader.readLine();
				if(msg == null){
					break;
				}
				mDispatcher.dispatchMsg(mSocket, msg);
			} catch (IOException ioex) {
				System.out.println("Error communicating with some of the clients!");
			}
			mDispatcher.deleteClient(mSocket);
		}
	}

}