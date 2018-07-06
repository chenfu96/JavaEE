package com.bjsxt.prototype;

import java.util.Date;

/**
 * 原型模式深复制
 * @author Administrator
 *
 */
public class Client2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date data = new Date(2333333);
		sheep2 s1 = new sheep2("少立",data);
		System.out.println(s1.getName()+"---"+s1.getBirthday());
		sheep2 s2 = (sheep2) s1.clone();
		s1.setBirthday(new Date(44433));
		System.out.println(s1.getBirthday());
		s2.setName("多利");
		System.out.println(s2.getName()+"----"+s2.getBirthday());
	}
}
