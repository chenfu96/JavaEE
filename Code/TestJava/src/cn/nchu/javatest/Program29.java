package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		System.out.println("������Ÿ����֣�");
		Scanner input = new Scanner(System.in);
		int [][] a = new int[3][3];
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("��һ���Խ���֮�ͣ�" + (a[0][0] + a[1][1] + a[2][2]));
		System.out.println("�ڶ����Խ���֮�ͣ�" + (a[0][2] + a[1][1] + a[2][0]));
		input.close();
	}
}
 