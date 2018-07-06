package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		char[] b = a.toCharArray();
		Arrays.sort(b);
		System.out.println(b);
	}
}
 