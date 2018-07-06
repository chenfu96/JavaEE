package cn.nchu.javatest;

import java.util.Scanner;




public class Program49 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String a = input.next();
		int start = 0, cnt = 0;
		while((start = s.indexOf(a, start)) != -1){
			cnt++;
			start += a.length();
		}
		System.out.println(cnt);
	}
}
 