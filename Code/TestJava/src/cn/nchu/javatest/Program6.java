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
		System.out.println("���Լ����" + gcd(a, b) + "��С��������" + a * b / gcd(a, b));
		input.close();
	}
}
