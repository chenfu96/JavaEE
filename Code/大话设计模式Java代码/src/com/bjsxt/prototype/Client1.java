package com.bjsxt.prototype;

import java.util.Date;

/**
 * 原型模式深复制
 * @author acer
 *
 */
public class Client1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(2333333);
		Resume1 s1 = new Resume1("大鸟", "男", 29, date);
		Resume1 s2 = (Resume1) s1.clone();
		System.out.println(s1.getDate() + "--------" + s2.getDate());
		System.out.println(s1.getName() + "--------" + s2.getName());
		s2.setDate(new Date(13141314));
		s2.setName("小菜");
		System.out.println(s1.getDate() + "--------" + s2.getDate());
		System.out.println(s1.getName() + "--------" + s2.getName());
	}
}
