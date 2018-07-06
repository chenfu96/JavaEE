package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		s.append(input.next()).append("@");
		System.out.println(s.indexOf("@"));
	}
}
 