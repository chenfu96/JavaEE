package cn.nchu.javatest;

import java.util.Scanner;

/**
 * 约瑟夫环问题
 * @author acer
 *
 */

public class Program38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int result =  0;
		for(int i = 2; i <= n; ++i){
			result = (result + m) % i;
		}
		System.out.println(result + 1);
	}
}
 