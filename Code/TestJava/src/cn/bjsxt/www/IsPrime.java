package cn.bjsxt.www;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int num = input.nextInt();
			System.out.println(num + (isPrime(num) ? "是" : "不是") + "素数！");
		}
		input.close();
	}
	
	 public static boolean isPrime(int num){
		 if(num == 0 || num == 1)	return false;
		 for(int i = 2; i * i <= num; ++i)
			 if(num % i == 0)
				 	return false;
		 return true;
	 }
}
