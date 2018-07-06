package com.bjsxt.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 测试正则表达式对象分割操作
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
