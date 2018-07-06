package cn.bjsxt.www;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		System.out.print("please input your grade:");
		Scanner input = new Scanner(System.in);
		float grade = input.nextFloat();
		if(grade > 100 || grade < 0){
			System.err.println("please input right grade");
		}else if(grade >= 60){
			System.err.println("your are pass");
		}else{
			System.out.println("you are not pass");
		}
		input.close();
	}
}
