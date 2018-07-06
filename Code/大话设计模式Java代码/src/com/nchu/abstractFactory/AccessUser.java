package com.nchu.abstractFactory;

public class AccessUser implements IUser {

	public void insert(User user) {
		System.out.println("在Access 中给user表增加一条记录");
	}

	public User getUser(int id) {
		System.out.println("根据给定的id得到user表的一条记录");
		return null;
	}
}
