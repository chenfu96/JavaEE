package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		char[] ch = Long.toString(num).toCharArray();
		int n = ch.length;
		System.out.println("该整数从右端开始的4-7位为："+ch[n-7]+ch[n-6]+ch[n-5]+ch[n-4]);
		input.close();
	}
}
 