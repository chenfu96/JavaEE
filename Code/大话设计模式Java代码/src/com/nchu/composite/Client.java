package com.nchu.composite;

public class Client {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany com = new ConcreteCompany("�Ϻ������ֹ�˾");
		com.add(new HRDepartment("�����ֹ�˾������Դ��"));
		com.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(com);
		

		ConcreteCompany com1 = new ConcreteCompany("�Ͼ����´�");
		com.add(new HRDepartment("�Ͼ����´�������Դ��"));
		com.add(new FinanceDepartment("�Ͼ����´�����"));
		com.add(com1);
		
		ConcreteCompany com2 = new ConcreteCompany("���ݰ��´�");
		com.add(new HRDepartment("���ݰ��´�������Դ��"));
		com.add(new FinanceDepartment("���ݰ��´�����"));
		com.add(com2);
		
		System.out.println("�ṹͼ��");
		root.display(1);
		
		System.out.println("ְ��");
		root.lineOfDuty();
	}
}
