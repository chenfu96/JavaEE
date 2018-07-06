package cn.nchu.javatest;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		System.out.println("请输入你创造的利润(单位：万元):");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入金额数字：");
		while(input.hasNext()){
			int num = input.nextInt();
			double result = 0.0;
			if(num <= 10){
				result = num * 0.1;
			}else if(num <= 20){
				result = (num - 10) * 0.075;
			}else if(num <= 40){
				result = (num - 10) * 0.05 + 1.75;
			}else if(num <= 60){
				result = (num - 10) * 0.03 + 2.75;
			}else if(num <= 100){
				result = (num - 10) * 0.015 + 3.35;
			} else{
				result = (num - 100) * 0.01 + 3.95;
			}
			System.out.println(num + "万元利润，可以获得：" + String.format("%.3f", result) + "万元");
			System.out.println("请输入金额数字：");
		}
	}
}
