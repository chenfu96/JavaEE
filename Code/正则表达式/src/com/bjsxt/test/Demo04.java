package com.bjsxt.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����������ʽ����ָ����
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		
		String str = "a232b433c3434";
		String[] arrs =  str.split("\\d+");	
		
		System.out.println(Arrays.toString(arrs));
		
	}
}
