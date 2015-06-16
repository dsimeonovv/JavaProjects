package chatserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Vector;

public class ServerMsgDispatcher extends Thread {
	private Vector mClients = new Vector();
	private Vector mMsgQueue = new Vector();

	public synchronized void dispatchMsg(Socket aSocket, String msg) {
		String IP = aSocket.getInetAddress().getHostAddress();
		String port = "" + aSocket.getPort();
		msg = IP + ":" + port + ":" + msg + "\n\r";
		mMsgQueue.add(msg);
		notify();
	}

	public synchronized void deleteClient(Socket aClientSock) {
		int i = mClients.indexOf(aClientSock);
		if (i != -1) {
			mClients.removeElementAt(i);
		}
		try {
			aClientSock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void addClient(Socket aClientSocket) {
		mClients.add(aClientSocket);
	}

	private synchronized String getNextMsgFromQueue()
			throws InterruptedException {
		while (mMsgQueue.size() == 0) {
			wait();
		}
		String message = (String) mMsgQueue.get(0);
		mMsgQueue.removeElementAt(0);
		return message;
	}

	private synchronized void sendMsgToAllClients(String aMsg) {
		for (int i = 0; i < mClients.size(); i++) {
			Socket socket = (Socket) mClients.get(i);
			try {
				OutputStream out = socket.getOutputStream();
				out.write(aMsg.getBytes());
				out.flush();
			} catch (IOException ioe) {
				deleteClient(socket);
			}
		}
	}

	public void run() {
		try {
			while (true) {
				String msg = getNextMsgFromQueue();
				sendMsgToAllClients(msg);
			}
		} catch (InterruptedException ie) {
			// Thread interrupted. Do nothing
		}
	}

}
