package com.simple.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class ConsoleLogger implements MyLogger {

	public static void main(String[] args) {
		MyLogger ml = new ConsoleLogger();
		Scanner input = new Scanner(System.in);

		System.out.println("Give value for level, it must be between 1 and 3");
		int n = input.nextInt();
		System.out.println("Now enter message");
		String y = input.next();

		ml.log(n, y);

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
