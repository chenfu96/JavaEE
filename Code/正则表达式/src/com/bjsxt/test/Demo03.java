package com.bjsxt.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 测试正则表达式对象替换操作
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		//在这个字符串fjgsnjkga23456是否符合指定的正则表达式\w+
		
		Pattern p = Pattern.compile("[0-9]");
		
		//创建Matche对象
		Matcher m = p.matcher("aa222**ssd445*sds233");
		
		String Str = m.replaceAll("#");
		System.out.println(Str);
		
	}
}
