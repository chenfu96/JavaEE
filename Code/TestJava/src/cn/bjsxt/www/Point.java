package cn.bjsxt.www;

import java.util.Scanner;

public class Point {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
        System.out.println("�������һ��Բ��x���꣺");
        int x1 = input.nextInt();
        System.out.println("�������һ��Բ��y���꣺");
        int y1 = input.nextInt();
        System.out.println("�������һ��Բ�İ뾶��");
        int r1 = input.nextInt();
        System.out.println("������ڶ���Բ��x���꣺");
        int x2 = input.nextInt();
        System.out.println("������ڶ���Բ��y���꣺");
        int y2 = input.nextInt();
        System.out.println("������ڶ���Բ�İ뾶��");
        int r2 = input.nextInt();
        int rMin=(int) Math.pow(r1 - r2, 2);
        int rMax=(int) Math.pow(r1 + r2, 2);
        int copyR = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        if(rMin > copyR && r2 <r1){
        	System.out.println("�ڶ���Բ�ڵ�һ��Բ��");
        }else if(rMin == copyR){
        	System.out.println("��Բ����");
        }else if(copyR > rMin && copyR < rMax){
        	System.out.println("��Բ�ཻ");
        }else if(copyR == rMax){
        	System.out.println("��Բ����");
        }else if(copyR > rMax){
        	System.out.println("��Բ����");
        }
	}
}
