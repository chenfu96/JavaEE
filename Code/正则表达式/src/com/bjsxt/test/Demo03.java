package com.bjsxt.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����������ʽ�����滻����
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		//������ַ���fjgsnjkga23456�Ƿ����ָ����������ʽ\w+
		
		Pattern p = Pattern.compile("[0-9]");
		
		//����Matche����
		Matcher m = p.matcher("aa222**ssd445*sds233");
		
		String Str = m.replaceAll("#");
		System.out.println(Str);
		
	}
}
