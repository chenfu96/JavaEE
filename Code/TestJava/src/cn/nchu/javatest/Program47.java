package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program47 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int n = input.nextInt();
			for(int i = 0; i < n; ++i){
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
 