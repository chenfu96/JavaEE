package cn.bjsxt.www;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Demo02 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long time = cin.nextLong();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(new Date(time)));
		System.out.println(format.format(new Date()));
	}
}
