package com.bjsxt.memento;

/**
 * Դ���������
 * @author Administrator
 *
 */
public class Emp {
	private String ename;
	private int age;
	private double salary;
	
	//���б���¼�����������ر���¼����
	
	public EmpMemento memento () {
		return new EmpMemento(this);
	}
	
	//�������ݻָ�
	public void recovery(EmpMemento mmt) {
		this.ename = mmt.getEname();
		this.age = mmt.getAge();
		this.salary = mmt.getSalary();
	}
	
	public Emp(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
}
