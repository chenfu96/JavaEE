package cn.nchu.javatest;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		String a, b, c;
		String[] racer = {"x", "y", "z"};
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				for(int k = 0; k < 3; ++k){
					if(i != j && i != k && j != k){
						a = racer[i];
						b = racer[j];
						c = racer[k];
						if(!a.equals("x") && !c.equals("z") && !c.equals("x") ){
							System.out.println("a的对手是："+racer[i]+"，b的对手是："+racer[j] +"，c的对手是："+racer[k] );
						}
					}
				}
			}
		}
	}
}
