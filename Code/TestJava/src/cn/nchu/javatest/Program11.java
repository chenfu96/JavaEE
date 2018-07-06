package cn.nchu.javatest;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		for(int i  = 1; i <= 4; ++i){
			for(int j = 1; j <= 4; ++j){
				for(int k = 1; k <= 4; ++k){
					int sum = i * 100 + j * 10 + k;
					System.out.print(sum + " ");
				}
			}
		}
	}
}
