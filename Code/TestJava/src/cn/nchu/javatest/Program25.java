package cn.nchu.javatest;

import java.util.Scanner;

public class Program25 {

    public static boolean isHuiWen(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(isHuiWen(text));
        input.close();
    }
}
