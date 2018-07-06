package com.bjsxt.four;

public class MyException extends Exception {

	public MyException(){
		
	}
	
	public MyException(String message){
		super(message);
	}
}

class TestMyException{
	
	public void test() throws MyException {
		
	}
	public static void main(String[] args) {
		
		try {
			new TestMyException().test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
