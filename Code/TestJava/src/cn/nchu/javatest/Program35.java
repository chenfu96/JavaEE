package cn.nchu.javatest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;



public class Program35 {

	private static final int INF = 0x3f3f3f3f;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		int index1 = 0, index2 = 0, minn = INF, maxn = -INF;
		for(int i = 0; i < n; ++i){
			a[i] = input.nextInt();
			if(minn > a[i]){
				index1 = i;
				minn = a[i];
			}
			if(a[i] > maxn){
				index2 = i;
				maxn = a[i];
			}
		}
		a[index2] = a[n - 1];
		a[n - 1] = maxn;
		a[index1] = a[0];
		a[0] = minn;
		System.out.println(Arrays.toString(a));
		input.close();
	}
}
 