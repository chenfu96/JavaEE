package cn.nchu.javatest;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		System.out.println("�������㴴�������(��λ����Ԫ):");
		Scanner input = new Scanner(System.in);
		System.out.println("�����������֣�");
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
			System.out.println(num + "��Ԫ���󣬿��Ի�ã�" + String.format("%.3f", result) + "��Ԫ");
			System.out.println("�����������֣�");
		}
	}
}
