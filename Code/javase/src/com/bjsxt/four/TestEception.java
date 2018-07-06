package com.bjsxt.four;

public class TestEception {

	public static void main(String[] args) {
//		int i = 1 / 0;
//		Computer c = null;
//		c.start();  //对象是null, 调用对象方法或属性
	
	
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
		System.out.println("电脑启动！");
	}
}
