package com.bjsxt.templatemethod;

abstract class TestPaper {

	public abstract String Answer1(); 
	public abstract String Answer2();
	public abstract String Answer3();
	public void testQuestion1(){
		System.out.println("1 + 0 = A 1  B 2  C 3" + "´ð°¸£º" + Answer1() );
	}
	public void testQuestion2(){
		System.out.println("1 + 1 = A 1  B 2  C 3" + "´ð°¸£º" + Answer2() );
	}
	public void testQuestion3(){
		System.out.println("1 + 2 = A 1  B 2  C 3" + "´ð°¸£º" + Answer3() );
	}
	public void result(){
		testQuestion1();
		testQuestion2();
		if(wantSolve()){
			testQuestion3();
		}
	}
	public boolean wantSolve(){
		return true;
	}
}
