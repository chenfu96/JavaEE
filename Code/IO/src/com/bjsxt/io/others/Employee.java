package com.bjsxt.io.others;
/**
 * �սӿ�ֻ�Ǳ�ʶ
 * @author Administrator
 *
 */
public class Employee implements java.io.Serializable {
	//����Ҫ���л�
	private transient String name;  //transient����Ҫ���л�
	private double salary;
	public Employee() {
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}