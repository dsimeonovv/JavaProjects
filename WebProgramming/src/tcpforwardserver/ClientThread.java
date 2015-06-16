package tcpforwardserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread {
	private Socket mClientSocket;
	private Socket mServerSocket;
	private boolean mForwardinActive = false;

	public ClientThread(Socket aClientSocket) {
		this.mClientSocket = aClientSocket;
	}

	/**
	 * Establishes connection to the destination server and starts bidirectional
	 * forwarding ot data between the client and the server.
	 */
	public void run() {
		InputStream clientIn;
		OutputStream clientOut;
		InputStream serverIn;
		OutputStream serverOut;

		try {
			// Connect to the destination server
			this.mServerSocket = new Socket(TCPForwardServer.DESTINATION_HOST,
					TCPForwardServer.DESTINATION_PORT);
			// Turn on keep-alive for both the sockets
			mServerSocket.setKeepAlive(true);
			mClientSocket.setKeepAlive(true);

			clientIn = mClientSocket.getInputStream();
			clientOut = mClientSocket.getOutputStream();
			serverIn = mServerSocket.getInputStream();
			serverOut = mServerSocket.getOutputStream();

		} catch (IOException ioe) {
			System.out.println("Can not connect to: "
					+ TCPForwardServer.DESTINATION_HOST + ":"
					+ TCPForwardServer.DESTINATION_PORT);
			connectionBroken();
			return;
		}
		// Start forwarding data between server and client
		mForwardinActive = true;
		ForwardThread clientForward = new ForwardThread(this, clientIn,
				serverOut);
		clientForward.start();
		ForwardThread serverForward = new ForwardThread(this, serverIn,
				clientOut);
		serverForward.start();
		System.out.println("TCP Forwarding: "
				+ mClientSocket.getInetAddress().getHostAddress() + ":"
				+ mClientSocket.getPort() + "<-->"
				+ mServerSocket.getInetAddress().getHostAddress() + ":"
				+ mServerSocket.getPort() + "started");

	}

	synchronized void connectionBroken() {
		try {
			mServerSocket.close();
		} catch (Exception e) {
		}
		try {
			mClientSocket.close();
		} catch (Exception e) {
		}
		
		if(mForwardinActive){
			System.out.println("TCP Forwarding: "
					+ mClientSocket.getInetAddress().getHostAddress() + ":"
					+ mClientSocket.getPort() + "<-->"
					+ mServerSocket.getInetAddress().getHostAddress() + ":"
					+ mServerSocket.getPort() + "stopped");
			mForwardinActive = false;
		}

	}

}
