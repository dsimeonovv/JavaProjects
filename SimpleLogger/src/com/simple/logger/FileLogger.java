package com.simple.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class FileLogger implements MyLogger {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fileWriter = new PrintStream("log.txt");
		
		MyLogger ml = new FileLogger();
		Scanner input = new Scanner(System.in);
		Date date = new Date();

		System.out.println("Give value for level, it must be between 1 and 3");
		int n = input.nextInt();
		System.out.println("Now enter message");
		String message = input.next();
		
		ml.log(n, message);
		
		if(n == 1){
			fileWriter.print("INFO::" + getISO8601StringForDate(date) + "::" + message);
		}
		else if(n == 2){
			fileWriter.print("WARNING::" + getISO8601StringForDate(date) + "::" + message);
		}
		else if(n == 3){
			fileWriter.print("PLSCHECKFFS::" + getISO8601StringForDate(date) + "::" + message);
		}	
		
		fileWriter.close();
		
	}

	@Override
	public void log(int level, String message) {
		Date date = new Date();
		if (level == 1) {
			System.out.println("INFO::" + getISO8601StringForDate(date) + "::" + message);
		} else if (level == 2) {
			System.out.println("WARNING::" + getISO8601StringForDate(date) + "::" + message);
		} else if (level == 3) {
			System.out.println("PLSCHECKFFS::" + getISO8601StringForDate(date) + "::"	+ message);
		}
	}

	private static String getISO8601StringForDate(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'TO'HH:mm:ss+00:00", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateFormat.format(date);
	}
	
	
}
