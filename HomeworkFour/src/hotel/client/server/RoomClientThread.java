package hotel.client.server;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomClientThread extends Thread {
	Socket s;
	Scanner in;
	PrintStream out;
	Scanner inputc = new Scanner(System.in);
	static List<Room> rooms = new ArrayList<Room>();

	// PrintStream izprashta
	// Scanner poluchava

	public RoomClientThread(Socket s) {
		this.s = s;
		try {
			in = new Scanner(s.getInputStream());
			out = new PrintStream(s.getOutputStream());
		} catch (IOException e) {
		}
	}

	public void run() {
		out.println("Hello..");
		//int input = inputc.nextInt();

		switch (in.nextInt()) {
		case 1:
			int counter = 0;
			out.println(5);
			for (Room room : rooms) {
				rooms.add(room);
				if (room.isAvailable()) {
					counter++;
					out.println(counter);
					out.println(room);
				}
			}
			break;
		case 2:
			out.println(3);
			for (Room room : rooms) {
				if (room.isBeds() < 3) {
					out.println(room);
				}
			}
			break;
		case 3:
			out.println(6);
			int counterOne = 0;
			for (int i = 0; i < rooms.size(); i++) {
				if (rooms.get(i).isAvailable()) {
					counterOne++;
					out.println(counterOne);
					out.println("Success");
					out.println("It is confurmed");
				}
			}
			out.println("Something is wrong.");
			break;
		case 4:
			out.println(2);
			for (Room room : rooms) {
				if (room.isAvailable()) {
					out.println(room);
				} else {
					out.println("There is no free rooms");
				}
			}
			break;
		default:
			out.println("Wrong choice, choose correct option");
			break;
		}

	}
}
