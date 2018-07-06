package cn.bjsxt.www;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
        System.out.println("请输入第一个圆的x坐标：");
        int x1 = input.nextInt();
        System.out.println("请输入第一个圆的y坐标：");
        int y1 = input.nextInt();
        System.out.println("请输入第一个圆的半径：");
        int r1 = input.nextInt();
        System.out.println("请输入第二个圆的x坐标：");
        int x2 = input.nextInt();
        System.out.println("请输入第二个圆的y坐标：");
        int y2 = input.nextInt();
        System.out.println("请输入第二个圆的半径：");
        int r2 = input.nextInt();
        int rMin=(int) Math.pow(r1 - r2, 2);
        int rMax=(int) Math.pow(r1 + r2, 2);
        int copyR = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        if(rMin > copyR && r2 <r1){
        	System.out.println("第二个圆在第一个圆内");
        }else if(rMin == copyR){
        	System.out.println("两圆相切");
        }else if(copyR > rMin && copyR < rMax){
        	System.out.println("两圆相交");
        }else if(copyR == rMax){
        	System.out.println("两圆外切");
        }else if(copyR > rMax){
        	System.out.println("两圆相离");
        }
	}
}
