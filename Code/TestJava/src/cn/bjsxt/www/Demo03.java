package cn.bjsxt.www;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x1 = cin.nextInt();
		int x2 = cin.nextInt();
		int y1 = cin.nextInt();
		int y2 = cin.nextInt();
		System.out.println((int)Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
	}
}
