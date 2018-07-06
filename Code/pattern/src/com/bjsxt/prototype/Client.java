package com.bjsxt.prototype;

import java.util.Date;

/**
 * 测试原型(浅克隆)
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date data = new Date(2333333);
		sheep s1 = new sheep("少立",data);
		System.out.println(s1.getName()+"---"+s1.getBirthday());
		s1.setBirthday(new Date(44433));
		System.out.println(s1.getBirthday());
		sheep s2 = (sheep) s1.clone();
		s2.setName("多利");
		System.out.println(s2.getName()+"----"+s2.getBirthday());
	}
}
