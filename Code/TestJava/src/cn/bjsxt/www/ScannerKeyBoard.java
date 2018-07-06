package cn.bjsxt.www;

import java.util.Scanner;

public class ScannerKeyBoard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int num = input.nextInt();
			int[] digit = new int[10];
			int len = 0;
			while(num != 0){
				digit[len++] = num % 10;
				num = num / 10;
			}
			for(int i = 0; i < len; ++i){
				System.out.println(digit[i]);
			}
		}
	}
}
