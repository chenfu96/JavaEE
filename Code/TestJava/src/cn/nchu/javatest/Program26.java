package cn.nchu.javatest;

import java.util.Scanner;

public class Program26 {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String s2 = null;
		switch(s){
		case "m" :
			System.out.println("Monday");break;
		case "t" : System.out.println("������ڶ�����ĸ��");
			s2 = input.next();
			if(s2.equals("u")){
				System.out.println("Tuesday");
			}else if(s2.equals("h")){
				System.out.println("Thursday");
			}else{
				System.out.println("���������ĸ����");
			}	break;
		case "w" : System.out.println("Wednesday");	break;
		case "f" : System.out.println("Friday");	break;
		case "s" :
			System.out.println("������ڶ�����ĸ��");
			s2 = input.next();
			if(s2.equals("u")){
				System.out.println("Sunday");
			}else if(s2.equals("a")){
				System.out.println("Saturday");
			}else{
				System.out.println("���������ĸ����");
			} break;
			default : System.out.println("���������ĸ����ȷ��"); break;
		}
		input.close();
	}
}
