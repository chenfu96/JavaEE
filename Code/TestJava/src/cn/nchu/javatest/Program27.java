package cn.nchu.javatest;

import java.util.Scanner;

public class Program27 {

	private static int[] prime  = new int[101];
	public static void getPrimeList(){
		for(int i = 2; i * i <= 100; ++i){
			for(int j = 2; j * i<= 100; ++j){
				prime[i * j] = 1;
			}
		}
	}
    public static void main(String[] args) {
    	getPrimeList();
    	for(int i = 2; i <= 100; ++i){
    		if(prime[i] == 0){
    			System.out.print(i + " ");
    		}
    	}
	}
}
