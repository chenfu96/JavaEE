package cn.nchu.javatest;

import java.util.Scanner;

public class Program4 {

	public static void main(String[]args){ 
        Scanner input = new Scanner(System.in); 
        
        int number = input.nextInt(); 
         
        int k = 2; 
        System.out.print(number + "=" ); 
        while(number > k){ 
            if(number % k == 0){ 
                System.out.print(k + "*"); 
                number = number / k; 
            }else{ 
                k++; 
            } 
        } 
        System.out.print(number+";");
        
        input.close();
    } 
}
