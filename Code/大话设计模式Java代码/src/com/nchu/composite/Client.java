package com.nchu.composite;

public class Client {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany com = new ConcreteCompany("上海华东分公司");
		com.add(new HRDepartment("华东分公司人力资源部"));
		com.add(new FinanceDepartment("华东分公司财务部"));
		root.add(com);
		

		ConcreteCompany com1 = new ConcreteCompany("南京办事处");
		com.add(new HRDepartment("南京办事处人力资源部"));
		com.add(new FinanceDepartment("南京办事处财务部"));
		com.add(com1);
		
		ConcreteCompany com2 = new ConcreteCompany("杭州办事处");
		com.add(new HRDepartment("杭州办事处人力资源部"));
		com.add(new FinanceDepartment("杭州办事处财务部"));
		com.add(com2);
		
		System.out.println("结构图：");
		root.display(1);
		
		System.out.println("职责：");
		root.lineOfDuty();
	}
}
