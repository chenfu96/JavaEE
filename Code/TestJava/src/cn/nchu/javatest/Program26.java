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
		case "t" : System.out.println("请输入第二个字母：");
			s2 = input.next();
			if(s2.equals("u")){
				System.out.println("Tuesday");
			}else if(s2.equals("h")){
				System.out.println("Thursday");
			}else{
				System.out.println("你输入的字母有误！");
			}	break;
		case "w" : System.out.println("Wednesday");	break;
		case "f" : System.out.println("Friday");	break;
		case "s" :
			System.out.println("请输入第二个字母：");
			s2 = input.next();
			if(s2.equals("u")){
				System.out.println("Sunday");
			}else if(s2.equals("a")){
				System.out.println("Saturday");
			}else{
				System.out.println("你输入的字母有误！");
			} break;
			default : System.out.println("你输入的字母不正确！"); break;
		}
		input.close();
	}
}
