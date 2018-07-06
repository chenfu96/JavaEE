package com.bjsxt.memento;

public class Client {

	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("高旗", 18, 900);
		System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento()); //备忘一次
		
		emp.setEname("高旗1");
		emp.setAge(20);
		emp.setSalary(90000);
		System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

		//恢复到保存的 状态
		emp.recovery(taker.getMemento());
		System.out.println("第三次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

	}
}
