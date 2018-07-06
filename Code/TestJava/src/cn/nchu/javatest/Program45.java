package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt = 0;
		while(n > 9){
			cnt++;
			n /= 9;
		}
		System.out.println(cnt);
		input.close();
	}
}
 