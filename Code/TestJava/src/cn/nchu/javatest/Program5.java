package cn.nchu.javatest;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		char result = score >= 90 ? 'A' : (score < 60 ? 'C' : 'B');
		System.out.println("³É¼¨ÊÇ£º" + result);
		
		input.close();
	}
}
