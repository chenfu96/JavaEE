package cn.nchu.javatest;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		System.out.println("the complete in 1000 is :");
		for(int i = 1; i <= 1000; ++i){
			int sum = 0;
			for(int j = 1; j < i; ++j){
				if(i % j == 0){
					sum += j;
				}
			}
			if(sum == i){
				System.out.print(i + " ");
			}
		}
	}
}
