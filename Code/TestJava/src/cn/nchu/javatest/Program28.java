package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < 10; ++i){
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < 10; ++i){
			System.out.print(a[i] + " ");
		}
		input.close();
	}
}
 