package cn.nchu.javatest;

import java.util.Scanner;

public class Program1 {
	private static int[] dp = new int[510];
	
	public static void fibona(){
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i < 510; ++i){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
	}

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		Program1.fibona();
		int month = input.nextInt();
		System.out.println(month + "月份后兔子数是：" + dp[month]);
		input.close();
	}
}
