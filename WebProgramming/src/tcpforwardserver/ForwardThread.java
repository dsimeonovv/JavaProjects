package tcpforwardserver;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ForwardThread extends Thread {
	private static final int BUFFER_SIZE = 8192;

	InputStream mInputStream;
	OutputStream mOutputStream;
	ClientThread mParent;

	/**
	 * Creates a new traffic redirection thread specifying its parent, input
	 * stream and output stream.
	 */

	public ForwardThread(ClientThread aParent, InputStream aInputStream,
			OutputStream aOutputStream) {
		this.mInputStream = aInputStream;
		this.mOutputStream = aOutputStream;
		this.mParent = aParent;
	}

	/**
	 * Runs the thread. Continuously reads the input stream and writes the read
	 * data to the output stream. If reading or writing fail, exits the thread
	 * and notifies the parent about the failure.
	 */
	public void run() {
		byte[] buffer = new byte[BUFFER_SIZE];
		try {
			while (true) {
				int bytesRead = mInputStream.read(buffer);
				if (bytesRead == -1) {
					break;
				}
				mOutputStream.write(buffer, 0, bytesRead);
				((Flushable) mInputStream).flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mParent.connectionBroken();
	}

}
