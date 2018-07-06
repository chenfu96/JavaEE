package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入的数的个数：");
		int n = input.nextInt();
		int[] a = new int[n + 1];
		for(int i = 0; i < n; ++i){
			a[i] = input.nextInt();
		}
		System.out.print("插入的数：");
		int m = input.nextInt();
		for(int i = 0; i < n; ++i){
			if(m < a[i]){
				for(int j = n - 1; j>= i; --j){
					a[j + 1] = a[j];
				}
				a[i] = m;
				break;
			}
		}
		if(a[n - 1] <= m)	a[n] = m;
		System.out.println("插入数后的数组" + Arrays.toString(a));
		input.close();
	}
}
 