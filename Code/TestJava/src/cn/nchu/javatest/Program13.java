package cn.nchu.javatest;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		for(int i = 0; i < 100000; ++i){
			int a = (int) Math.sqrt(i + 100);
			int b = (int) Math.sqrt(i + 168);
			if((i + 100) == a * a && b * b == (i + 168)){
				System.out.print(i + " ");
			}
		}
	}
}
