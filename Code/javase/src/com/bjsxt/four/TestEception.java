package com.bjsxt.four;

public class TestEception {

	public static void main(String[] args) {
//		int i = 1 / 0;
//		Computer c = null;
//		c.start();  //������null, ���ö��󷽷�������
	
	
//		String str = "123adv";
//		
//		Integer i = new Integer(str);
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Computer {
	void start(){
		System.out.println("����������");
	}
}
