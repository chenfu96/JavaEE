package cn.bjsxt.www;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter year(e.g 2008):");
	    int year=input.nextInt();
	    System.out.println("Enter month(1-12):");
	    int month=input.nextInt();
	    System.out.println("Enter the day of the month(1-31):");
	    int day=input.nextInt();
	    int h=(day+(26*(month+1)/10)+year%100+(year%100/4)+year/100/4+5*year/100)%7;//克里斯汀-泽勒计算某天是星期几的算法公式
	    switch(h){
	        case 0: System.out.println("The day is Saturday");
	                break;
	        case 1: System.out.println("The day is Sunday");
	                break;
	        case 2: System.out.println("The day is Monday");
	                break;
	        case 3: System.out.println("The day is Tuesday");
	                break;
	        case 4: System.out.println("The day isWednesday");
	                break;
	        case 5: System.out.println("The day is Thursday");
	                break;
	        case 6: System.out.println("The day is Friday");
	                break;
	        }
	    input.close();
	}
}

