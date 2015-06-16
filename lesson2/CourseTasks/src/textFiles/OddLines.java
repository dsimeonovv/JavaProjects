package textFiles;

import java.io.*;

public class OddLines {
	public static void main(String[] args) {
		File File = new File("test.txt");
	}

	BufferedReader in;
	String read;
	int linenum = 12;

	public void File() {
		try {
			in = new BufferedReader(new FileReader("MAP_allData.txt"));

			for (linenum = 0; linenum < 20; linenum++) {

				read = in.readLine();
				if (read == null) {
				} else {
					System.out.println(read);
				}
			}
			in.close();
		} catch (IOException e) {
			System.out.println("There was a problem:" + e);

		}
	}
}
