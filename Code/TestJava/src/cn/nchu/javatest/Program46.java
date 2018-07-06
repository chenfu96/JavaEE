package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		char[] c = new char[a.length() + b.length()];
		for(int i = 0; i < a.length(); ++i)
			c[i] = a.toCharArray()[i];
		for(int i = 0, j = a.length(); i < b.length(); ++i, ++j)
			c[j] = b.toCharArray()[i];
		System.out.println(c);
		input.close();
	}
}
 