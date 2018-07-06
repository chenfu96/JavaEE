package com.bjsxt.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 测试正则表达式的基本语法
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		//在这个字符串fjgsnjkga23456是否符合指定的正则表达式\w+
		
		Pattern p = Pattern.compile("\\w+");
		
		//创建Matche对象
		Matcher m = p.matcher("asfsd&&f23323");
		
//		boolean yes = m.matches();	//尝试将整个字符序列与该模式匹配
		
//		boolean yes2 = m.find();	//	该方法扫描输入的序列，查找与该模式匹配的下一个子序列
		
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.group(0));//group(),group(0)匹配整个表达式的子字符串
		}		
		
	}
}
