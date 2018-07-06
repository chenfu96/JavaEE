package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		System.out.println("请输入九个数字：");
		Scanner input = new Scanner(System.in);
		int [][] a = new int[3][3];
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("第一条对角线之和：" + (a[0][0] + a[1][1] + a[2][2]));
		System.out.println("第二条对角线之和：" + (a[0][2] + a[1][1] + a[2][0]));
		input.close();
	}
}
 