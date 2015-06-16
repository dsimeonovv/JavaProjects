package strings;

import java.util.Scanner;

public class Encoding {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String key = "done";

        System.out.println("Enter some text");
        String input = in.next();

        String[] result = new String[input.length()];

        int readIndex = 0;
        int checkIndex = 0;

        while (readIndex < input.length())
        {
            while (checkIndex < key.length() && readIndex < input.length())
            {
                result[readIndex] = (input.indexOf(readIndex) ^ key.indexOf(checkIndex));
                checkIndex++;
                readIndex++;
            }
            checkIndex = 0;
        }

        System.out.println("Encrypted:");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");

        System.out.println();

        String[] decrypted = new String[result.length];

        readIndex = 0;

        while (readIndex < input.length())
        {
            while (checkIndex < key.length() && readIndex < input.length())
            {
                decrypted[readIndex] = ((int) (result[readIndex]) ^ key[checkIndex]).ToString();
                checkIndex++;
                readIndex++;
            }
            checkIndex = 0;
        }

        System.out.println("Decrypted:");
        for (int i = 0; i < result.length; i++)
            Console.Write((char)((int) (decrypted[i])));

        System.out.println();
	}
}
