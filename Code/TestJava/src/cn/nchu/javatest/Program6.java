package cn.nchu.javatest;

import java.util.Scanner;

public class Program6 {

	public static int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("最大公约数：" + gcd(a, b) + "最小公倍数：" + a * b / gcd(a, b));
		input.close();
	}
}
