package cn.bjsxt.www;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("please input the triangle :");
		  Scanner input = new Scanner(System.in);
		  a = input.nextInt();
		  b = input.nextInt();
		  c = input.nextInt();
		  if(a + b <= c || a - b >= c){
			  System.out.println("It is not a triangle");
		  }else if(a == b && b == c){
			  System.out.println("Equilteral triangle");
		  }else if(a == b || b == c || a == c){
			  System.out.println("Isosceles triangle");
		  }else if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || 
				  Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)){
			  System.out.println("Right triangle");
		  }else{
			  System.out.println("General triangle");
		  }
		  input.close();
	}
}
