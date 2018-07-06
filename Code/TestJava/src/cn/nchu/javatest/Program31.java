package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; ++i){
			a[i] = input.nextInt();
		}
		for(int i = n - 1; i >= 0; --i){
			System.out.print(a[i] + " , ");
		}
		input.close();
	}
}
 