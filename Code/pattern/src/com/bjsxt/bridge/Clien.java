package com.bjsxt.bridge;

public class Clien {

	public static void main(String[] args) {
		//销售联想笔记本电脑
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		
	}
}
