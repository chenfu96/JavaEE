package cn.bjsxt.www;

import java.sql.Array;
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int hasPass = getPass(n);
		System.out.println(hasPass);
		input.close();
	}
	public static int getPass(int n){
		int[] score = new int[n];
		int pass = 0;
		for(int i = 0; i < score.length; ++i){
			score[i] = (int) (Math.random() * 101);
		}
		for(int i = 0; i < score.length; ++i){
			if(score[i] >= 60){
				pass++;
			}
		}
		return pass;
	}
}
