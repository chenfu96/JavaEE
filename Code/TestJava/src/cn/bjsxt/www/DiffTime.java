package cn.bjsxt.www;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DiffTime {

	public static void main(String[] args) throws Exception {
		int year, month, date;
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		month = input.nextInt();
		date = input.nextInt();
		System.out.println(dateDiff(year, month, date));
		input.close();
	}
	public static long dateDiff(int year, int month, int day) { 
		Calendar c1 = Calendar.getInstance();
		c1.set(year, month - 1, day);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(new Date());
		long diffDays = (c2.getTimeInMillis() - c1.getTimeInMillis()) / (1000 * 60 * 60 * 24); 
		return diffDays; 
	}
}
