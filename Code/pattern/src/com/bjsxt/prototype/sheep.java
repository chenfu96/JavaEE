package com.bjsxt.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 1997,Ӣ���Ŀ�¡�򣬶�����
 * @author Administrator
 *
 */
public class sheep implements Cloneable ,Serializable{
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//ֱ�ӵ���obje�����clone����
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public sheep() {
	}

	public sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
}
