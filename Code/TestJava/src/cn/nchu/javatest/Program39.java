package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double result = 0;
		if(n % 2 == 0){
			for(double i = 2; i <= n; i += 2){
				result += 1 / i;
			}
		}else{
			for(double i = 1; i <= n; i += 2){
				result += 1 / i; 
			}
		}
		System.out.println(String.format("%.4f", result));
	}
}
 