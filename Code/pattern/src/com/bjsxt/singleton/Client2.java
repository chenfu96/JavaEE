package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import javax.imageio.stream.FileImageInputStream;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class Client2 {

	public static void main(String[] args) throws Exception {
		SingletonDemo06 s1 = SingletonDemo06.getInstance();
		SingletonDemo06 s2 = SingletonDemo06.getInstance();
		System.out.println(s1+"-----"+s2);
		
		
//		ͨ������ķ�ʽ����˽�й�����
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("com.bjsxt.singleton.SingletonDemo06");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo06 s3 = c.newInstance();
//		SingletonDemo06 s4 = c.newInstance();
//		
//		System.out.println(s3+"----"+s4);
		
		//ͨ�������л��ķ�ʽ����������
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		oss.writeObject(s1);
		oss.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo06 s3 =(SingletonDemo06) ois.readObject();
		
		System.out.println(s3);
		
	}
}
