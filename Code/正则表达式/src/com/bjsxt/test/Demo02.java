package com.bjsxt.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����������ʽ�������Ĵ���
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		//������ַ���fjgsnjkga23456�Ƿ����ָ����������ʽ\w+
		
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		
		//����Matche����
		Matcher m = p.matcher("aa222**ssd445*sds233");
		
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}		
		
	}
}
