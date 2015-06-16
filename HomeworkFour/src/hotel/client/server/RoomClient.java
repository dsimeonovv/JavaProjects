package hotel.client.server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class RoomClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 1234);
		Scanner in = new Scanner(s.getInputStream());
		Scanner consoleInput = new Scanner(System.in);
		PrintStream out = new PrintStream(s.getOutputStream());

		while (true) {
			System.out.println("Choose correct option between 1 and 4");
			int opt = consoleInput.nextInt();
			out.println(opt);

			switch (opt) {
			case 1:
				for (int i = 0; i < 5; i++) {
					String msg = in.nextLine();
					System.out.println(msg);
				}
				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					String msg = in.nextLine();
					System.out.println(msg);
					System.out.println(in.nextLine());
				}
				break;
			case 3:
				for (int i = 0; i < 6; i++) {
					String msg = in.nextLine();
					System.out.println(msg);
				}
				break;
			case 4:
				for (int i = 0; i < 2; i++) {
					String msg = in.nextLine();
					System.out.println(msg);
				}
				break;
			default:
				break;
			}
		}
	}
}
