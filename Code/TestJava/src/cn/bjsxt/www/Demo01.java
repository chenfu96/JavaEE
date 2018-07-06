package cn.bjsxt.www;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int sum = 0;
		while(num != 0){
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
