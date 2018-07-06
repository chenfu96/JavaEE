package cn.nchu.javatest;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println(s.length() + "位数");
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("反转的数是" + sb);
		input.close();
	}
}
