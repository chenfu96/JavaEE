package com.bjsxt.prototype;

import java.util.Date;

/**
 * ����ԭ��(ǳ��¡)
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date data = new Date(2333333);
		sheep s1 = new sheep("����",data);
		System.out.println(s1.getName()+"---"+s1.getBirthday());
		s1.setBirthday(new Date(44433));
		System.out.println(s1.getBirthday());
		sheep s2 = (sheep) s1.clone();
		s2.setName("����");
		System.out.println(s2.getName()+"----"+s2.getBirthday());
	}
}
