package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class BinaryFileCopier {
	public static void main(String[] args) throws IOException{
		FileInputStream inFile = new FileInputStream("input.bin");
		FileOutputStream outFile = new FileOutputStream("output.bin");
		
		byte buf[] = new byte[1024];
		while(true){
			int bytesRead = inFile.read(buf);
			if(bytesRead == -1){
				break;
			}
			outFile.write(buf, 0, bytesRead);
		}
		inFile.close();
		outFile.close();
		
	}
}
