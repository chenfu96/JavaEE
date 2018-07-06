package cn.nchu.javatest;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, n;
		a = input.nextInt();
		n = input.nextInt();
		long sum = 0;
		for(int i = 1; i <= n; ++i){
			sum += a;
			a = 10 * a + a;
		}
		System.out.println("The result is " + sum);
		input.close();
	}
}
