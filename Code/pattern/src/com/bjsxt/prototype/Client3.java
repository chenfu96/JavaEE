package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式（深复制，使用序列化和反序列化的模式实现深克隆）
 * @author Administrator
 *
 */
public class Client3 {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {

		Date data = new Date(2333333);
		sheep s1 = new sheep("少立",data);
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		
		//使用序列化和反序列化深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		sheep s2 = (sheep) ois.readObject();//克隆好的对象
		
		s1.setName("多利");
		s1.setBirthday(new Date(6666666));
		System.out.println(s1.getName()+"----"+s1.getBirthday());
		System.out.println(s2.getName()+"----"+s2.getBirthday());
	}
}
