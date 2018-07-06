package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program44 {
	private static int[] a = new int[100];
	private static int[] b = new int[100];
	public static int listPrime(){
		int index = 0;
		for(int i = 2; i < 100; ++i){
			if(a[i] == 0){
				b[index++] = i;
				for(int j = i + i; j < 100; j += i){
					a[i] = 1;
				}
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int length = listPrime();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int flag = -1;
		for(int i = 0; i < length; ++i){
			if(a[n - b[i]] == 0){
				flag = i;
				break;
			}
		}
		if(flag != -1){
			System.out.println(b[flag] + " " + (n - b[flag]));
		}
		input.close();
	}
}
 