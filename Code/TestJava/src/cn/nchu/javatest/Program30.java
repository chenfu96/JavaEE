package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ĸ�����");
		int n = input.nextInt();
		int[] a = new int[n + 1];
		for(int i = 0; i < n; ++i){
			a[i] = input.nextInt();
		}
		System.out.print("���������");
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
		System.out.println("�������������" + Arrays.toString(a));
		input.close();
	}
}
 