package cn.nchu.javatest;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int isLetter = 0;
		int isNum = 0;
		int isSpace = 0;
		int elseChar = 0;
		String s = input.nextLine();
		for(int i = 0; i < s.length(); ++i){
			if(Character.isDigit(s.charAt(i))){
				isNum++;
			}else if(Character.isSpaceChar(s.charAt(i))){
				isSpace++;
			}else if(Character.isLetter(s.charAt(i))){
				isLetter++;
			}else{
				elseChar++;
			}
		}
		System.out.println("������ַ�������ĸ��" + isLetter + "����");
		System.out.println("������ַ��������֣�" + isNum + "����");
		System.out.println("������ַ����пո�" + isSpace + "����");
		System.out.println("������ַ�����������ĸ��" + elseChar + "����");
		input.close();
	}
}
