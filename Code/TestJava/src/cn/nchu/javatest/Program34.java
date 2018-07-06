package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;



public class Program34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = input.nextInt();
		a[1] = input.nextInt();
		a[2] = input.nextInt();
		Arrays.sort(a);
		for(int i = a.length - 1; i >= 0; --i)
			System.out.print(a[i] + " ");
	}
}
 