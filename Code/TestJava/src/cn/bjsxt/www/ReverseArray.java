package cn.bjsxt.www;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 9; i >= 0; --i){
			a[i] = input.nextInt();
		}
		for(int i = 0; i < 10; ++i){
			System.out.print(a[i] + " ");
		}
		input.close();
	}
}
