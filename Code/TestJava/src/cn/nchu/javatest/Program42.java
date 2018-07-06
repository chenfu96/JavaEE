package cn.nchu.javatest;

import java.util.Arrays;
import java.util.Scanner;



public class Program42 {

	public static void main(String[] args) {
		int ss = 10;
		for(int i = 10; i < 100; ++i){
			if(809 * i == 800 * i + 9 * i){
				ss = i;
				break;
			}
		}
		System.out.println(ss);
		System.out.println(ss * 809);
	}
}
 