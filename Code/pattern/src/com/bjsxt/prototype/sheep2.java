package com.bjsxt.prototype;

import java.util.Date;

/**
 * 1997,Ӣ���Ŀ�¡�򣬶�����
 * @author Administrator
 *
 */
public class sheep2 implements Cloneable{
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//ֱ�ӵ���obje�����clone����
		
		//������´���ʵ����ƣ�deep clone��
		
		sheep2 s = (sheep2)obj;
		s.birthday = (Date) this.birthday.clone();//������Ҳ���п�¡
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

	public sheep2() {
	}

	public sheep2(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
}
