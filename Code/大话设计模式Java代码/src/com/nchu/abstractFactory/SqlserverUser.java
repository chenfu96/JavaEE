package com.nchu.abstractFactory;

public class SqlserverUser implements IUser {

	public void insert(User user) {
		System.out.println("��SQL server �и�user������һ����¼");
	}

	public User getUser(int id) {
		System.out.println("���ݸ�����id�õ�user���һ����¼");
		return null;
	}
}
