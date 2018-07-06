package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program48 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = null;
		s = input.next();
		char[] a = s.toCharArray();
		for(int i = 0; i < 4; ++i){
			a[i] = (char) ((a[i] - '0' + 5) % 10 + '0');
		}
		char temp = a[0];
		a[0] = a[3];
		a[3] = temp;
		temp = a[1];
		a[1] = a[2];
		a[2] = temp;
		System.out.println(a);
		input.close();
	}
}
 