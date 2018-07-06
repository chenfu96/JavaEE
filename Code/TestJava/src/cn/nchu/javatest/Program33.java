package cn.nchu.javatest;

import java.util.Arrays;



public class Program33 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		a[0][0] = 1;
		for(int i = 0; i < 10; ++i){
			a[i][0] = 1;
			for(int j = 1; j <= i ; ++j){
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		for(int i = 0; i < 10; ++i){
			for(int j = 0; j <= i; ++j){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
 