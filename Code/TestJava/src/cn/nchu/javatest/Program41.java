package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(test(10));
	}
	public static int test(int ret){
		int result = ret;
		for(int i = 0; i < 5; ++i){
			if(ret % 5 != 1){
				return test(result + 1);
			}
			ret = (ret - 1) / 5 * 4;
		}
		return result;
	}
}
 