package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; ++i){
			a[i] = input.nextInt();
		}
		int[] b = new int[n];
		for(int i = 0; i < n; ++i){
			b[(i + m) % n] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
 