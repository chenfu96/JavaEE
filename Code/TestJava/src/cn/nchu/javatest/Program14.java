package cn.nchu.javatest;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int sum = day;
		for(int i = 0; i < month - 1; ++i){
			sum += arr[i];
		}
		System.out.println("一年的第" + (sum + (isRight(year) ? 1 : 0)) + "天");
	}
	public static boolean isRight(int year){
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			return true;
		}
		return false;
	}
}



