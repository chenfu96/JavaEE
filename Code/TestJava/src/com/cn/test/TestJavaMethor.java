package com.cn.test;

public class TestJavaMethor {

	public static void main(String[] args) {
		
		String value = "abc";
		char result[] = new char[value.length()];
        System.arraycopy(result, 0, value, 0, value.length());
        
	}
}