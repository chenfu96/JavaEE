package cn.nchu.javatest;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int n = input.nextInt();
		int sum = h;
		for(int i = 2; i <= n; ++i){
			sum += h * 2;
			h /= 2;
		}
		input.close();
		System.out.println("����" + n + "�κ��ܷ�����" + h + "�ף������ľ��룺" + sum);
	}
}
