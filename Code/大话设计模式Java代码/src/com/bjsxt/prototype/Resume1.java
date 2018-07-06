package com.bjsxt.prototype;

import java.util.Date;

public class Resume1 implements Cloneable {

	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Resume1 resume1 = (Resume1)obj;
		resume1.date = (Date) this.date.clone();
		return obj;
	}
	private String name;
	private String sex;
	private int age;
	private Date date;
	public Resume1(String name, String sex, int age, Date date) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
