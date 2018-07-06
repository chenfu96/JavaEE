package com.diqijie.shengsai;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random random = new Random(3);
		for(int i = 0; i < 100000000; ++i){
			int temp;
			if((temp = random.nextInt(1000)) < 100)
			{
				System.out.println(temp);
			}
		}
	}
}
