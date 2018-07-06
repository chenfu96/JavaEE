package com.bjsxt.prototype;

import java.util.Date;

/**
 * 1997,英国的克隆羊，多利！
 * @author Administrator
 *
 */
public class sheep2 implements Cloneable{
	private String name;
	private Date birthday;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用obje对象的clone方法
		
		//添加如下代码实现深复制（deep clone）
		
		sheep2 s = (sheep2)obj;
		s.birthday = (Date) this.birthday.clone();//把属性也进行克隆
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
