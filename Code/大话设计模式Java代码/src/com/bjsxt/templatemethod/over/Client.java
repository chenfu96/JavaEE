package com.bjsxt.templatemethod.over;

public class Client {

	public static void main(String[] args) {
		TestPaper testPaperA = new TestPaperA();
		TestPaper testPaperB = new TestPaperB();
		System.out.println("the result of testPaperA");
		testPaperA.result();
		System.out.println("the result of testPaperB");
		testPaperB.result();
	}
}
