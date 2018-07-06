package cn.bjsxt.www;

import java.util.Scanner;

public class TestSum {

	public static void main(String[] args) {
		System.out.print("please input a number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = getSum(num);
		System.out.println("The number sum is : " + sum);
		input.close();
	}
	
	public static int getSum(int num){
		int sum = 0;
		while(num != 0){
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}
}
