package com.bjsxt.memento;

public class Client {

	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("����", 18, 900);
		System.out.println("��һ�δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento()); //����һ��
		
		emp.setEname("����1");
		emp.setAge(20);
		emp.setSalary(90000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

		//�ָ�������� ״̬
		emp.recovery(taker.getMemento());
		System.out.println("�����δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

	}
}
