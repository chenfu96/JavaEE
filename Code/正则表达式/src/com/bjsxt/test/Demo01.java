package com.bjsxt.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ����������ʽ�Ļ����﷨
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		//������ַ���fjgsnjkga23456�Ƿ����ָ����������ʽ\w+
		
		Pattern p = Pattern.compile("\\w+");
		
		//����Matche����
		Matcher m = p.matcher("asfsd&&f23323");
		
//		boolean yes = m.matches();	//���Խ������ַ��������ģʽƥ��
		
//		boolean yes2 = m.find();	//	�÷���ɨ����������У��������ģʽƥ�����һ��������
		
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.group(0));//group(),group(0)ƥ���������ʽ�����ַ���
		}		
		
	}
}
