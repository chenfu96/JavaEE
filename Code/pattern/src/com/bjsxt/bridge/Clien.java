package com.bjsxt.bridge;

public class Clien {

	public static void main(String[] args) {
		//��������ʼǱ�����
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		
	}
}
