package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ԭ��ģʽǳ����
 * @author acer
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		Date date = new Date(2333333);
		Resume s1 = new Resume("����", "��", 29, date);
		//ʹ�����л��ͷ����л����
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
				
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
				
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
				
		Resume s2 = (Resume) ois.readObject();//��¡�õĶ���
		System.out.println(s1.getDate() + "--------" + s2.getDate());
		System.out.println(s1.getName() + "--------" + s2.getName());
		s2.setDate(new Date(13141313));
		s2.setName("С��");
		System.out.println(s1.getDate() + "--------" + s2.getDate());
		System.out.println(s1.getName() + "--------" + s2.getName());
	}
}
